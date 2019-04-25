package com.service.Impl;

import com.dao.AccountDao;
import com.pojo.Member;
import com.pojo.Student;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/25 19:40
 * @Description
 * @Modified by:
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;
    
    @Override
    public List<Student> listAllStudentAccount() {
        /**
         * @Description
         * @author      jhao
         * @param       []
         * @return      java.util.List<com.pojo.Student>
         * @exception   
         * @date        2019/4/25 19:54
         */
        return accountDao.listAllStudentAccount();
    }

    @Override
    public List<Student> listAllMemberAccount() {
        /**
         * @Description
         * @author      jhao
         * @param       []
         * @return      java.util.List<com.pojo.Student>
         * @exception   
         * @date        2019/4/25 19:54
         */
        return accountDao.listAllMemberAccount();
    }

    @Override
    public int updateStudentPassword(Student student) {
        /**
         * @Description
         * @author      jhao
         * @param       [student]
         * @return      int
         * @exception   
         * @date        2019/4/25 19:54
         */
        return accountDao.updateStudentPassword(student);
    }

    @Override
    public int updateMemberPassword(Member member) {
        /**
         * @Description
         * @author      jhao
         * @param       [member]
         * @return      int
         * @exception   
         * @date        2019/4/25 19:54
         */
        return accountDao.updateMemberPassword(member);
    }
}
