package tests

interface MyTrait {

    default String loadKeyStoreFrom(String url, char[] passwordChars) {
        ''
    }

}