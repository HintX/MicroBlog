package microBlog.biz.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import microBlog.entity.User;
import microBlog.mapper.UserMapper;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userMapper.fetchUserByEmail(email);
		List<String> codes = new ArrayList<>();
		List<SimpleGrantedAuthority> authority = new ArrayList<>();
		
		//去除重复的功能
		/*for (Role role : user.getRoles()) {
			for (Function function : role.getFunctions()) {
				if (!codes.contains(function.getCode())) {
					codes.add(function.getCode());
				}
				for (Function children : function.getFunctions()) {
					if (!codes.contains(children.getCode())) {
						codes.add(children.getCode());
					}
				}
			}
		}
		for (String code : codes) {
			System.out.println(code);
			authority.add(new SimpleGrantedAuthority(code));
		}*/
		return null;
	}
	
}
