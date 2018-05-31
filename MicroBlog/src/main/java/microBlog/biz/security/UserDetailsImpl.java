package microBlog.biz.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import microBlog.entity.User;

@SuppressWarnings("serial")
public class UserDetailsImpl implements UserDetails{

	private User user;
	private List<SimpleGrantedAuthority> authority;
	
	public User getEmployee() {
		return user;
	}

	public UserDetailsImpl(User user, List<SimpleGrantedAuthority> authority) {
		super();
		this.user = user;
		this.authority = authority;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authority;
	}

	@Override
	public String getPassword() {
		return user.getPassWord();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

		
}
