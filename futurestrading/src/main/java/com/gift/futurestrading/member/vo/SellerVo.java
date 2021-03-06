package com.gift.futurestrading.member.vo;

/**
 * @author 정진우
 * 관리자 권한으로 판매자리스트를 조회할때 사용하는 VO
 * @ClassName : SellerVo
 * @since: JDK1.8
 * @LatestUpdate : 2018-12-28
 * 가입시 바인딩 되는 객체
 */
public class SellerVo {
	private String sellerIdPk;				// 아이디
	private String sellerPassword;			// 비밀번호
	private String sellerEmail;				// 이메일
	private String sellerName;				// 이름
	private String sellerJuminNo;			// 주민번호
	private String sellerSignUpDate;		// 가입날짜
	private String sellerAddressPostCode;	// 우편번호
	private String sellerAddressRoad;		// 도로명주소
	private String sellerAddressDetail;		// 상세주소
	private String sellerCorporateName;		// 상호명
	private String sellerPhone;				// 전화번호
	private String sellerRight;				// 권한
	private String sellerAdmitAdmin;		// 승인한 관리자
	private String sellerAdmitDate;			// 승인날짜
	public String getSellerIdPk() {
		return sellerIdPk;
	}
	public void setSellerIdPk(String sellerIdPk) {
		System.out.println("SellerVo.setSellerIdPk() 호출");
		this.sellerIdPk = sellerIdPk;
	}
	public String getSellerPassword() {
		return sellerPassword;
	}
	public void setSellerPassword(String sellerPassword) {
		System.out.println("SellerVo.setSellerPassword() 호출");
		this.sellerPassword = sellerPassword;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		System.out.println("SellerVo.setSellerEmail() 호출");
		this.sellerEmail = sellerEmail;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		System.out.println("SellerVo.setSellerName() 호출");
		this.sellerName = sellerName;
	}
	public String getSellerJuminNo() {
		return sellerJuminNo;
	}
	public void setSellerJuminNo(String sellerJuminNo) {
		System.out.println("SellerVo.setSellerJuminNo() 호출");
		this.sellerJuminNo = sellerJuminNo;
	}
	public String getSellerSignUpDate() {
		return sellerSignUpDate;
	}
	public void setSellerSignUpDate(String sellerSignUpDate) {
		System.out.println("SellerVo.setSellerSignUpDate() 호출");
		this.sellerSignUpDate = sellerSignUpDate;
	}
	public String getSellerAddressPostCode() {
		return sellerAddressPostCode;
	}
	public void setSellerAddressPostCode(String sellerAddressPostCode) {
		System.out.println("SellerVo.setSellerAddressPostCode() 호출");
		this.sellerAddressPostCode = sellerAddressPostCode;
	}
	public String getSellerAddressRoad() {
		return sellerAddressRoad;
	}
	public void setSellerAddressRoad(String sellerAddressRoad) {
		System.out.println("SellerVo.setSellerAddressRoad() 호출");
		this.sellerAddressRoad = sellerAddressRoad;
	}
	public String getSellerAddressDetail() {
		return sellerAddressDetail;
	}
	public void setSellerAddressDetail(String sellerAddressDetail) {
		System.out.println("SellerVo.setSellerAddressDetail() 호출");
		this.sellerAddressDetail = sellerAddressDetail;
	}
	public String getSellerCorporateName() {
		return sellerCorporateName;
	}
	public void setSellerCorporateName(String sellerCorporateName) {
		System.out.println("SellerVo.setSellerCorporateName() 호출");
		this.sellerCorporateName = sellerCorporateName;
	}
	public String getSellerPhone() {
		return sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		System.out.println("SellerVo.setSellerPhone() 호출");
		this.sellerPhone = sellerPhone;
	}
	public String getSellerRight() {
		return sellerRight;
	}
	public void setSellerRight(String sellerRight) {
		System.out.println("SellerVo.setSellerRight() 호출");
		this.sellerRight = sellerRight;
	}
	public String getSellerAdmitAdmin() {
		return sellerAdmitAdmin;
	}
	public void setSellerAdmitAdmin(String sellerAdmitAdmin) {
		System.out.println("SellerVo.setSellerAdmitAdmin() 호출");
		this.sellerAdmitAdmin = sellerAdmitAdmin;
	}
	public String getSellerAdmitDate() {
		return sellerAdmitDate;
	}
	public void setSellerAdmitDate(String sellerAdmitDate) {
		System.out.println("SellerVo.setSellerAdmitDate() 호출");
		this.sellerAdmitDate = sellerAdmitDate;
	}
	@Override
	public String toString() {
		return "SellerVo [sellerIdPk=" + sellerIdPk + ", sellerPassword=" + sellerPassword + ", sellerEmail="
				+ sellerEmail + ", sellerName=" + sellerName + ", sellerJuminNo=" + sellerJuminNo
				+ ", sellerSignUpDate=" + sellerSignUpDate + ", sellerAddressPostCode=" + sellerAddressPostCode
				+ ", sellerAddressRoad=" + sellerAddressRoad + ", sellerAddressDetail=" + sellerAddressDetail
				+ ", sellerCorporateName=" + sellerCorporateName + ", sellerPhone=" + sellerPhone + ", sellerRight="
				+ sellerRight + ", sellerAdmitAdmin=" + sellerAdmitAdmin + ", sellerAdmitDate=" + sellerAdmitDate + "]";
	}
	
}
