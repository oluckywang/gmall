package com.wangL.gmall.service;



import com.wangL.gmall.bean.Member;
import com.wangL.gmall.bean.MemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<Member> getAllUser();

    List<MemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
