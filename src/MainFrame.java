import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;       // 🃏 مدير الكروت
    private JPanel cards;                // 📦 الصندوق اللي فيه كل الشاشات

    public MainFrame() {
        cardLayout = new CardLayout();                        // 🆕 ننشئ مدير الكروت
        cards = new JPanel(cardLayout);                       // 🆕 صندوق يرتب اللي داخله ككروت

        cards.add(center(new LoginPanel()), "login");         // 🆕 كرت 1 واسمه "login"
        cards.add(center(new SignUpPanel()), "signup");       // 🆕 كرت 2 واسمه "signup"

        add(cards);                                           // 🆕 نحط الصندوق في النافذة

        pack();                                               // حجم النافذة على قد أكبر شاشة
        setMinimumSize(getSize());                            // أصغر حجم مسموح

        showScreen("login", "Login");                         // 🆕 أول شاشة تطلع
    }

    // 🆕 تعرض الشاشة المطلوبة وتغير العنوان
    public void showScreen(String name, String title) {
        cardLayout.show(cards, name);                         // اعرض الكرت اللي بهالاسم
        setTitle(title);                                      // وغير عنوان النافذة
    }

    // 🆕 تحط الشاشة في النص بحجمها الطبيعي
    private JPanel center(JPanel screen) {
        JPanel wrapper = new JPanel(new GridBagLayout());     // غلاف يوسّط اللي داخله
        wrapper.add(screen);                                  // نحط الشاشة داخله
        return wrapper;                                       // نرجع الغلاف
    }
}