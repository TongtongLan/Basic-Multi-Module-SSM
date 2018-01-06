package com.youmeek.ssm;

import com.youmeek.ssm.manage.mapper.TbItemMapper;
import com.youmeek.ssm.manage.pojo.SysUser;
import com.youmeek.ssm.manage.pojo.TbItem;
import com.youmeek.ssm.manage.service.SysUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class taotaoTest {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Resource
	private TbItemMapper sysUserService;

	@Test
	public void test1() {
		TbItem sysUser = sysUserService.selectByPrimaryKey(562379L);
		logger.info("--------------------------------" + sysUser.getId() + sysUser.getTitle() +sysUser.getPrice());
	}
}
