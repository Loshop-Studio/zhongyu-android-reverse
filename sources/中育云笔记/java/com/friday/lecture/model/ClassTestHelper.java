package com.friday.lecture.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.helper.C5962b;
import com.friday.lecture.model.ClassTestHelper;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import ke.AbstractC9920d;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10935a0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p325rc.AbstractC10983y0;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ClassTestHelper {
    public static final int $stable;
    public static final ClassTestHelper INSTANCE;
    private static List<Pair<Boolean, MqttResponse.Student>> demonstratingList;
    private static String fullscreenMember;
    private static final LiveData<List<MqttResponse.Student>> onlineList;
    private static final MutableLiveData<List<MqttResponse.Student>> privateOnlineList;
    private static String randomlySelectedMember;
    private static MqttResponse recentlyHomework;
    private static LinkedHashSet<String> selectedList;
    private static final LinkedHashSet<MqttResponse.Student> submittedStudentList;

    static {
        ClassTestHelper classTestHelper = new ClassTestHelper();
        INSTANCE = classTestHelper;
        selectedList = classTestHelper.defaultSelectedList();
        demonstratingList = classTestHelper.defaultDemonstratingList();
        MutableLiveData<List<MqttResponse.Student>> mutableLiveData = new MutableLiveData<>(AbstractC10978w.m24136n());
        privateOnlineList = mutableLiveData;
        onlineList = mutableLiveData;
        submittedStudentList = new LinkedHashSet<>();
        $stable = 8;
    }

    private ClassTestHelper() {
    }

    private final List<Pair<Boolean, MqttResponse.Student>> defaultDemonstratingList() {
        return AbstractC10978w.m24141s(new Pair(Boolean.TRUE, new MqttResponse.Student(C5962b.f6082a.m5299a().m5293u(), getUserId())));
    }

    private final LinkedHashSet<String> defaultSelectedList() {
        return AbstractC10983y0.m24161g(getUserId());
    }

    private final String getName() {
        Random random = new Random();
        String str = new String[]{"赵", "钱", "孙", "李", "周", "吴", "季"}[random.nextInt(6)];
        if (random.nextInt(3) == 2) {
            int iNextInt = random.nextInt(Opcodes.LCMP);
            if (iNextInt % 2 == 0) {
                String strSubstring = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ".substring(iNextInt, iNextInt + 2);
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
                return str + strSubstring;
            }
            String strSubstring2 = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ".substring(iNextInt, iNextInt + 1);
            AbstractC9979u.m20293f(strSubstring2, "substring(...)");
            return str + strSubstring2;
        }
        int iNextInt2 = random.nextInt(Opcodes.LCMP);
        if (iNextInt2 % 2 == 0) {
            String strSubstring3 = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘".substring(iNextInt2, iNextInt2 + 2);
            AbstractC9979u.m20293f(strSubstring3, "substring(...)");
            return str + strSubstring3;
        }
        String strSubstring4 = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘".substring(iNextInt2, iNextInt2 + 1);
        AbstractC9979u.m20293f(strSubstring4, "substring(...)");
        return str + strSubstring4;
    }

    private final String getUserId() {
        return String.valueOf(C5962b.f6082a.m5299a().m5292t());
    }

    private final void resetSelectedAndDemoList() {
        selectedList = defaultSelectedList();
        demonstratingList = defaultDemonstratingList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setStudentList$lambda$4(MqttResponse.Student student, MqttResponse.Student student2) {
        return Collator.getInstance(Locale.CHINESE).compare(student.getStudentName(), student2.getStudentName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setStudentList$lambda$5(InterfaceC9544p interfaceC9544p, Object obj, Object obj2) {
        return ((Number) interfaceC9544p.invoke(obj, obj2)).intValue();
    }

    public final void addSubmitted(MqttResponse.Student student) {
        if (student != null) {
            submittedStudentList.add(student);
        }
    }

    public final void classEnd() {
        recentlyHomework = null;
        submittedStudentList.clear();
    }

    public final void clearSelectedList() {
        selectedList.clear();
    }

    public final List<Pair<Boolean, MqttResponse.Student>> getDemonstratingList() {
        return demonstratingList;
    }

    public final String getFullscreenMember() {
        return fullscreenMember;
    }

    public final LiveData<List<MqttResponse.Student>> getOnlineList() {
        return onlineList;
    }

    public final String getRandomlySelectedMember() {
        return randomlySelectedMember;
    }

    public final MqttResponse getRecentlyHomework() {
        return recentlyHomework;
    }

    public final Set<String> getSelectedList() {
        return selectedList;
    }

    public final List<MqttResponse.Student> getStudentList() {
        List<MqttResponse.Student> value = privateOnlineList.getValue();
        return value == null ? AbstractC10978w.m24136n() : value;
    }

    public final int getSubmittedCount() {
        return submittedStudentList.size();
    }

    public final LinkedHashSet<MqttResponse.Student> getSubmittedList() {
        return submittedStudentList;
    }

    public final void removeFromDemonstratingList(Pair<Boolean, MqttResponse.Student> student) {
        AbstractC9979u.m20294g(student, "student");
        demonstratingList.remove(student);
        selectedList.remove(((MqttResponse.Student) student.m20052g()).getStudentId());
        if (AbstractC9979u.m20289b(((MqttResponse.Student) student.m20052g()).getStudentId(), fullscreenMember) || demonstratingList.size() == 1) {
            setFullscreenMember(null);
        }
    }

    public final void resetState() {
        recentlyHomework = null;
        submittedStudentList.clear();
        privateOnlineList.setValue(AbstractC10978w.m24136n());
        resetSelectedAndDemoList();
        randomlySelectedMember = null;
        fullscreenMember = null;
    }

    public final void setFullscreenMember(String str) {
        fullscreenMember = str;
    }

    public final void setRandomMember(String str) {
        randomlySelectedMember = str;
    }

    public final void setRecentlyHomework(MqttResponse mqttResponse) {
        recentlyHomework = mqttResponse;
    }

    public final void setStudentList(List<MqttResponse.Student> list) {
        List<MqttResponse.Student> arrayList;
        Object next;
        if (list == null || (arrayList = AbstractC10947g0.m23925a1(list)) == null) {
            arrayList = new ArrayList<>();
        }
        final InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: j3.a
            @Override // p181hd.InterfaceC9544p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(ClassTestHelper.setStudentList$lambda$4((MqttResponse.Student) obj, (MqttResponse.Student) obj2));
            }
        };
        AbstractC10935a0.m23853A(arrayList, new Comparator() { // from class: j3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ClassTestHelper.setStudentList$lambda$5(interfaceC9544p, obj, obj2);
            }
        });
        C5962b.a aVar = C5962b.f6082a;
        MqttResponse.Student student = new MqttResponse.Student(aVar.m5299a().m5293u(), String.valueOf(aVar.m5299a().m5292t()));
        int i10 = 0;
        arrayList.add(0, student);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = selectedList.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            Iterator<T> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (AbstractC9979u.m20289b(((MqttResponse.Student) next2).getStudentId(), str)) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                linkedHashSet.add(str);
            }
        }
        selectedList.clear();
        selectedList.addAll(linkedHashSet);
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (AbstractC9979u.m20289b(((MqttResponse.Student) next).getStudentId(), randomlySelectedMember)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MqttResponse.Student student2 = (MqttResponse.Student) next;
        randomlySelectedMember = student2 != null ? student2.getStudentId() : null;
        for (Object obj2 : demonstratingList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            Pair pair = (Pair) obj2;
            if (!arrayList.contains(pair.m20052g())) {
                demonstratingList.set(i10, Pair.m20047e(pair, Boolean.FALSE, null, 2, null));
                if (AbstractC9979u.m20289b(randomlySelectedMember, ((MqttResponse.Student) pair.m20052g()).getStudentId())) {
                    randomlySelectedMember = null;
                }
            }
            i10 = i11;
        }
        privateOnlineList.setValue(arrayList);
    }

    public final void setTeacherDemonstrating() {
        demonstratingList.clear();
        demonstratingList.add(new Pair<>(Boolean.TRUE, new MqttResponse.Student(C5962b.f6082a.m5299a().m5293u(), getUserId())));
    }

    public final void timeUp() {
        MqttResponse.Data data;
        MqttResponse mqttResponse = recentlyHomework;
        if (mqttResponse == null || (data = mqttResponse.getData()) == null) {
            return;
        }
        data.setCanSubmit(false);
    }

    public final void updateDemonstratingList() {
        List listM24136n;
        Object next;
        demonstratingList.clear();
        List<Pair<Boolean, MqttResponse.Student>> list = demonstratingList;
        List<MqttResponse.Student> value = onlineList.getValue();
        if (value != null) {
            listM24136n = new ArrayList();
            for (Object obj : value) {
                if (selectedList.contains(((MqttResponse.Student) obj).getStudentId())) {
                    listM24136n.add(obj);
                }
            }
        } else {
            listM24136n = AbstractC10978w.m24136n();
        }
        List listM20011S = AbstractC9920d.m20011S(listM24136n);
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM20011S, 10));
        Iterator it = listM20011S.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair(Boolean.TRUE, (MqttResponse.Student) it.next()));
        }
        list.addAll(arrayList);
        Iterator<T> it2 = demonstratingList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (AbstractC9979u.m20289b(((MqttResponse.Student) ((Pair) next).m20052g()).getStudentId(), fullscreenMember)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next == null) {
            setFullscreenMember(null);
        }
    }

    public final void updateSelectedList(MqttResponse.Student student) {
        AbstractC9979u.m20294g(student, "student");
        if (selectedList.contains(student.getStudentId())) {
            selectedList.remove(student.getStudentId());
        } else {
            selectedList.add(student.getStudentId());
        }
    }

    /* renamed from: getOnlineList, reason: collision with other method in class */
    public final List<MqttResponse.Student> m33975getOnlineList() {
        List<MqttResponse.Student> value = privateOnlineList.getValue();
        return value == null ? AbstractC10978w.m24136n() : value;
    }
}
