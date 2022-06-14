<h1>로그인, 회원가입 예제</h1>

<h3>서비스 로직 주의사항</h3>
<pre>
loadUserByUsername()
상세 정보를 조회하는 메서드이며, 사용자의 계정정보와 권한을 갖는 
UserDetails 인터페이스를 반환해야 합니다.
매개변수는 로그인 시 입력한 아이디인데, 
엔티티의 PK를 뜻하는게 아니고 유저를 식별할 수 있는 어떤 값을 의미합니다. 
Spring Security에서는 username라는 이름으로 사용합니다.
즉 로그인 시에는 반드시 뷰단에서 name="username"을 사용해야함
</pre>
