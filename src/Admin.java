class Admin {
    private static Admin instance;

    private Admin() {
        // ��������� �����������
    }

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    public void manageMenu() {
        System.out.println("���������� ���� ��������������");
    }
}
