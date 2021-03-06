package com.wlt.service;

import java.util.List;

import com.wlt.domain.Account;

/**
 * 账户的业务层接口    全是AOP连接点  被增强的方法称为切入点
 * @author Administrator
 *
 */
public interface AccountService {
	/**
	 * 保存账户
	 * @param account
	 */
	void saveAccount(Account account);
	/**
	 * 更新账户
	 * @param account
	 */
	void updateAccount(Account account);
	/**
	 * 删除账户
	 * @param accountId
	 */
	void deleteAccount(Integer accountId);
	/**
	 * 根据id查询账户信息
	 * @param accountId
	 * @return
	 */
	Account findAccountById(Integer accountId);
	/**
	 * 查询所有账户
	 * @return
	 */
	List<Account> findAllAccount();
	/**
	 * 转账
	 * @param sourceName 转出账户
	 * @param targetName 转入账户
	 * @param money 转账金额
	 */
	void transfer(String sourceName,String targetName,Float money);
	/**
	 * 这个方法只能算连接点不能算切入点
	 */
	void test();

}
