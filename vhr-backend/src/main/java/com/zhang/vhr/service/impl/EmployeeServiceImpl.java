package com.zhang.vhr.service.impl;

import com.zhang.vhr.entity.Employee;
import com.zhang.vhr.mapper.EmployeeMapper;
import com.zhang.vhr.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanghe
 * @since 2021-03-20
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
