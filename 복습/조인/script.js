// 이메일 유효성 검사 함수
function validateEmail(email){
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
    return emailPattern.test(email);
}

// 비밀번호 유효성 검사 함수
function validatePassword(password){
    const passwordPattern = /^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
    return passwordPattern.test(password);
}
const emailInput = document.getElementById('email');
const passwordInput = document.getElementById('password');
const confirmpasswordInput = document.getElementById('confirmPassword');
const emailerror = document.getElementById('emailError');
const passworderror = document.getElementById('passwordError')
const confirmPassworderror = document.getElementById('confirmPasswordError')


// 이메일 입력 실시간 검사
emailInput.addEventListener('input', function(){
    const email = emailInput.value;
    if(!validateEmail(email)){
        emailerror.textContent = "유효한 이메일 형식을 입력하세요."
        emailerror.style.display = 'block';
    } else{
        emailerror.style.display = 'none';
    }
})

// 비밀번호 입력 실시간 검사
passwordInput.addEventListener('input', function(){
    const password = passwordInput.value;
    if(!validatePassword(password)){
        passworderror.textContent = "비밀번호는 최소 8자이며, 숫자와 특수문자를 포함해야 합니다."
        passworderror.style.display = 'block';
    } else{
        passworderror.style.display = 'none';
    }
})

// 비밀번호 확인 실시간 검사
confirmpasswordInput.addEventListener('input', function(){
    const confirmPassword = confirmpasswordInput.value;
    const passowrd = passwordInput.value;
    if(confirmPassword != passowrd){
        confirmPassworderror.textContent = "비밀번호가 일치하지 않습니다."
        confirmPassworderror.style.display = 'block';
    } else{
        confirmPassworderror.style.display = 'none';
    }
})
