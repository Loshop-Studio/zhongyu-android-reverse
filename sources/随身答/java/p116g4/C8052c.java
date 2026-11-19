package p116g4;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.zykj.student.dialogue.bean.resp.CollectSessionRespKt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import p094e4.InterfaceC7845b;
import p126h4.C8096a;
import p126h4.C8097b;
import p156k4.InterfaceC8270a;
import p168l4.AbstractC8884a;
import p168l4.AbstractC8885b;

/* renamed from: g4.c */
/* loaded from: classes4.dex */
public class C8052c {

    /* renamed from: y */
    public static DateFormat f13663y = new SimpleDateFormat(CollectSessionRespKt.SDF_WITH_SECONDS);

    /* renamed from: a */
    public View f13664a;

    /* renamed from: b */
    public WheelView f13665b;

    /* renamed from: c */
    public WheelView f13666c;

    /* renamed from: d */
    public WheelView f13667d;

    /* renamed from: e */
    public WheelView f13668e;

    /* renamed from: f */
    public WheelView f13669f;

    /* renamed from: g */
    public WheelView f13670g;

    /* renamed from: h */
    public int f13671h;

    /* renamed from: i */
    public boolean[] f13672i;

    /* renamed from: p */
    public int f13679p;

    /* renamed from: q */
    public int f13680q;

    /* renamed from: r */
    public int f13681r;

    /* renamed from: s */
    public int f13682s;

    /* renamed from: t */
    public int f13683t;

    /* renamed from: u */
    public float f13684u;

    /* renamed from: v */
    public WheelView.DividerType f13685v;

    /* renamed from: x */
    public InterfaceC8270a f13687x;

    /* renamed from: j */
    public int f13673j = 1900;

    /* renamed from: k */
    public int f13674k = 2100;

    /* renamed from: l */
    public int f13675l = 1;

    /* renamed from: m */
    public int f13676m = 12;

    /* renamed from: n */
    public int f13677n = 1;

    /* renamed from: o */
    public int f13678o = 31;

    /* renamed from: w */
    public boolean f13686w = false;

    /* renamed from: g4.c$a */
    public class a implements InterfaceC7845b {
        public a() {
        }

        @Override // p094e4.InterfaceC7845b
        /* renamed from: a */
        public void mo12296a(int i9) {
            int iM13805h;
            int i10 = i9 + C8052c.this.f13673j;
            C8052c.this.f13666c.setAdapter(new C8096a(AbstractC8884a.m13801d(i10)));
            if (AbstractC8884a.m13804g(i10) == 0 || C8052c.this.f13666c.getCurrentItem() <= AbstractC8884a.m13804g(i10) - 1) {
                C8052c.this.f13666c.setCurrentItem(C8052c.this.f13666c.getCurrentItem());
            } else {
                C8052c.this.f13666c.setCurrentItem(C8052c.this.f13666c.getCurrentItem() + 1);
            }
            if (AbstractC8884a.m13804g(i10) == 0 || C8052c.this.f13666c.getCurrentItem() <= AbstractC8884a.m13804g(i10) - 1) {
                C8052c.this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13805h(i10, C8052c.this.f13666c.getCurrentItem() + 1))));
                iM13805h = AbstractC8884a.m13805h(i10, C8052c.this.f13666c.getCurrentItem() + 1);
            } else if (C8052c.this.f13666c.getCurrentItem() == AbstractC8884a.m13804g(i10) + 1) {
                C8052c.this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13803f(i10))));
                iM13805h = AbstractC8884a.m13803f(i10);
            } else {
                C8052c.this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13805h(i10, C8052c.this.f13666c.getCurrentItem()))));
                iM13805h = AbstractC8884a.m13805h(i10, C8052c.this.f13666c.getCurrentItem());
            }
            int i11 = iM13805h - 1;
            if (C8052c.this.f13667d.getCurrentItem() > i11) {
                C8052c.this.f13667d.setCurrentItem(i11);
            }
            if (C8052c.this.f13687x != null) {
                C8052c.this.f13687x.m13373a();
            }
        }
    }

    /* renamed from: g4.c$b */
    public class b implements InterfaceC7845b {
        public b() {
        }

        @Override // p094e4.InterfaceC7845b
        /* renamed from: a */
        public void mo12296a(int i9) {
            int iM13805h;
            int currentItem = C8052c.this.f13665b.getCurrentItem() + C8052c.this.f13673j;
            if (AbstractC8884a.m13804g(currentItem) == 0 || i9 <= AbstractC8884a.m13804g(currentItem) - 1) {
                int i10 = i9 + 1;
                C8052c.this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13805h(currentItem, i10))));
                iM13805h = AbstractC8884a.m13805h(currentItem, i10);
            } else if (C8052c.this.f13666c.getCurrentItem() == AbstractC8884a.m13804g(currentItem) + 1) {
                C8052c.this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13803f(currentItem))));
                iM13805h = AbstractC8884a.m13803f(currentItem);
            } else {
                C8052c.this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13805h(currentItem, i9))));
                iM13805h = AbstractC8884a.m13805h(currentItem, i9);
            }
            int i11 = iM13805h - 1;
            if (C8052c.this.f13667d.getCurrentItem() > i11) {
                C8052c.this.f13667d.setCurrentItem(i11);
            }
            if (C8052c.this.f13687x != null) {
                C8052c.this.f13687x.m13373a();
            }
        }
    }

    /* renamed from: g4.c$c */
    public class c implements InterfaceC7845b {

        /* renamed from: a */
        public final /* synthetic */ List f13690a;

        /* renamed from: b */
        public final /* synthetic */ List f13691b;

        public c(List list, List list2) {
            this.f13690a = list;
            this.f13691b = list2;
        }

        @Override // p094e4.InterfaceC7845b
        /* renamed from: a */
        public void mo12296a(int i9) {
            int i10 = i9 + C8052c.this.f13673j;
            C8052c.this.f13679p = i10;
            int currentItem = C8052c.this.f13666c.getCurrentItem();
            if (C8052c.this.f13673j == C8052c.this.f13674k) {
                C8052c.this.f13666c.setAdapter(new C8097b(C8052c.this.f13675l, C8052c.this.f13676m));
                if (currentItem > C8052c.this.f13666c.getAdapter().mo12084a() - 1) {
                    currentItem = C8052c.this.f13666c.getAdapter().mo12084a() - 1;
                    C8052c.this.f13666c.setCurrentItem(currentItem);
                }
                int i11 = currentItem + C8052c.this.f13675l;
                if (C8052c.this.f13675l == C8052c.this.f13676m) {
                    C8052c c8052c = C8052c.this;
                    c8052c.m12771F(i10, i11, c8052c.f13677n, C8052c.this.f13678o, this.f13690a, this.f13691b);
                } else if (i11 == C8052c.this.f13675l) {
                    C8052c c8052c2 = C8052c.this;
                    c8052c2.m12771F(i10, i11, c8052c2.f13677n, 31, this.f13690a, this.f13691b);
                } else if (i11 == C8052c.this.f13676m) {
                    C8052c c8052c3 = C8052c.this;
                    c8052c3.m12771F(i10, i11, 1, c8052c3.f13678o, this.f13690a, this.f13691b);
                } else {
                    C8052c.this.m12771F(i10, i11, 1, 31, this.f13690a, this.f13691b);
                }
            } else if (i10 == C8052c.this.f13673j) {
                C8052c.this.f13666c.setAdapter(new C8097b(C8052c.this.f13675l, 12));
                if (currentItem > C8052c.this.f13666c.getAdapter().mo12084a() - 1) {
                    currentItem = C8052c.this.f13666c.getAdapter().mo12084a() - 1;
                    C8052c.this.f13666c.setCurrentItem(currentItem);
                }
                int i12 = currentItem + C8052c.this.f13675l;
                if (i12 == C8052c.this.f13675l) {
                    C8052c c8052c4 = C8052c.this;
                    c8052c4.m12771F(i10, i12, c8052c4.f13677n, 31, this.f13690a, this.f13691b);
                } else {
                    C8052c.this.m12771F(i10, i12, 1, 31, this.f13690a, this.f13691b);
                }
            } else if (i10 == C8052c.this.f13674k) {
                C8052c.this.f13666c.setAdapter(new C8097b(1, C8052c.this.f13676m));
                if (currentItem > C8052c.this.f13666c.getAdapter().mo12084a() - 1) {
                    currentItem = C8052c.this.f13666c.getAdapter().mo12084a() - 1;
                    C8052c.this.f13666c.setCurrentItem(currentItem);
                }
                int i13 = 1 + currentItem;
                if (i13 == C8052c.this.f13676m) {
                    C8052c c8052c5 = C8052c.this;
                    c8052c5.m12771F(i10, i13, 1, c8052c5.f13678o, this.f13690a, this.f13691b);
                } else {
                    C8052c.this.m12771F(i10, i13, 1, 31, this.f13690a, this.f13691b);
                }
            } else {
                C8052c.this.f13666c.setAdapter(new C8097b(1, 12));
                C8052c c8052c6 = C8052c.this;
                c8052c6.m12771F(i10, 1 + c8052c6.f13666c.getCurrentItem(), 1, 31, this.f13690a, this.f13691b);
            }
            if (C8052c.this.f13687x != null) {
                C8052c.this.f13687x.m13373a();
            }
        }
    }

    /* renamed from: g4.c$d */
    public class d implements InterfaceC7845b {

        /* renamed from: a */
        public final /* synthetic */ List f13693a;

        /* renamed from: b */
        public final /* synthetic */ List f13694b;

        public d(List list, List list2) {
            this.f13693a = list;
            this.f13694b = list2;
        }

        @Override // p094e4.InterfaceC7845b
        /* renamed from: a */
        public void mo12296a(int i9) {
            int i10 = i9 + 1;
            if (C8052c.this.f13673j == C8052c.this.f13674k) {
                int i11 = (i10 + C8052c.this.f13675l) - 1;
                if (C8052c.this.f13675l == C8052c.this.f13676m) {
                    C8052c c8052c = C8052c.this;
                    c8052c.m12771F(c8052c.f13679p, i11, C8052c.this.f13677n, C8052c.this.f13678o, this.f13693a, this.f13694b);
                } else if (C8052c.this.f13675l == i11) {
                    C8052c c8052c2 = C8052c.this;
                    c8052c2.m12771F(c8052c2.f13679p, i11, C8052c.this.f13677n, 31, this.f13693a, this.f13694b);
                } else if (C8052c.this.f13676m == i11) {
                    C8052c c8052c3 = C8052c.this;
                    c8052c3.m12771F(c8052c3.f13679p, i11, 1, C8052c.this.f13678o, this.f13693a, this.f13694b);
                } else {
                    C8052c c8052c4 = C8052c.this;
                    c8052c4.m12771F(c8052c4.f13679p, i11, 1, 31, this.f13693a, this.f13694b);
                }
            } else if (C8052c.this.f13679p == C8052c.this.f13673j) {
                int i12 = (i10 + C8052c.this.f13675l) - 1;
                if (i12 == C8052c.this.f13675l) {
                    C8052c c8052c5 = C8052c.this;
                    c8052c5.m12771F(c8052c5.f13679p, i12, C8052c.this.f13677n, 31, this.f13693a, this.f13694b);
                } else {
                    C8052c c8052c6 = C8052c.this;
                    c8052c6.m12771F(c8052c6.f13679p, i12, 1, 31, this.f13693a, this.f13694b);
                }
            } else if (C8052c.this.f13679p != C8052c.this.f13674k) {
                C8052c c8052c7 = C8052c.this;
                c8052c7.m12771F(c8052c7.f13679p, i10, 1, 31, this.f13693a, this.f13694b);
            } else if (i10 == C8052c.this.f13676m) {
                C8052c c8052c8 = C8052c.this;
                c8052c8.m12771F(c8052c8.f13679p, C8052c.this.f13666c.getCurrentItem() + 1, 1, C8052c.this.f13678o, this.f13693a, this.f13694b);
            } else {
                C8052c c8052c9 = C8052c.this;
                c8052c9.m12771F(c8052c9.f13679p, C8052c.this.f13666c.getCurrentItem() + 1, 1, 31, this.f13693a, this.f13694b);
            }
            if (C8052c.this.f13687x != null) {
                C8052c.this.f13687x.m13373a();
            }
        }
    }

    /* renamed from: g4.c$e */
    public class e implements InterfaceC7845b {
        public e() {
        }

        @Override // p094e4.InterfaceC7845b
        /* renamed from: a */
        public void mo12296a(int i9) {
            C8052c.this.f13687x.m13373a();
        }
    }

    public C8052c(View view, boolean[] zArr, int i9, int i10) {
        this.f13664a = view;
        this.f13672i = zArr;
        this.f13671h = i9;
        this.f13680q = i10;
        m12779N(view);
    }

    /* renamed from: A */
    public void m12766A(float f10) {
        this.f13684u = f10;
        m12792z();
    }

    /* renamed from: B */
    public final void m12767B(int i9, int i10, int i11, boolean z9, int i12, int i13, int i14) {
        WheelView wheelView = (WheelView) this.f13664a.findViewById(R$id.year);
        this.f13665b = wheelView;
        wheelView.setAdapter(new C8096a(AbstractC8884a.m13802e(this.f13673j, this.f13674k)));
        this.f13665b.setLabel("");
        this.f13665b.setCurrentItem(i9 - this.f13673j);
        this.f13665b.setGravity(this.f13671h);
        WheelView wheelView2 = (WheelView) this.f13664a.findViewById(R$id.month);
        this.f13666c = wheelView2;
        wheelView2.setAdapter(new C8096a(AbstractC8884a.m13801d(i9)));
        this.f13666c.setLabel("");
        int iM13804g = AbstractC8884a.m13804g(i9);
        if (iM13804g == 0 || (i10 <= iM13804g - 1 && !z9)) {
            this.f13666c.setCurrentItem(i10);
        } else {
            this.f13666c.setCurrentItem(i10 + 1);
        }
        this.f13666c.setGravity(this.f13671h);
        this.f13667d = (WheelView) this.f13664a.findViewById(R$id.day);
        if (AbstractC8884a.m13804g(i9) == 0) {
            this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13805h(i9, i10))));
        } else {
            this.f13667d.setAdapter(new C8096a(AbstractC8884a.m13799b(AbstractC8884a.m13803f(i9))));
        }
        this.f13667d.setLabel("");
        this.f13667d.setCurrentItem(i11 - 1);
        this.f13667d.setGravity(this.f13671h);
        WheelView wheelView3 = (WheelView) this.f13664a.findViewById(R$id.hour);
        this.f13668e = wheelView3;
        wheelView3.setAdapter(new C8097b(0, 23));
        this.f13668e.setCurrentItem(i12);
        this.f13668e.setGravity(this.f13671h);
        WheelView wheelView4 = (WheelView) this.f13664a.findViewById(R$id.min);
        this.f13669f = wheelView4;
        wheelView4.setAdapter(new C8097b(0, 59));
        this.f13669f.setCurrentItem(i13);
        this.f13669f.setGravity(this.f13671h);
        WheelView wheelView5 = (WheelView) this.f13664a.findViewById(R$id.second);
        this.f13670g = wheelView5;
        wheelView5.setAdapter(new C8097b(0, 59));
        this.f13670g.setCurrentItem(i13);
        this.f13670g.setGravity(this.f13671h);
        this.f13665b.setOnItemSelectedListener(new a());
        this.f13666c.setOnItemSelectedListener(new b());
        m12783q(this.f13667d);
        m12783q(this.f13668e);
        m12783q(this.f13669f);
        m12783q(this.f13670g);
        boolean[] zArr = this.f13672i;
        if (zArr.length != 6) {
            throw new RuntimeException("type[] length is not 6");
        }
        this.f13665b.setVisibility(zArr[0] ? 0 : 8);
        this.f13666c.setVisibility(this.f13672i[1] ? 0 : 8);
        this.f13667d.setVisibility(this.f13672i[2] ? 0 : 8);
        this.f13668e.setVisibility(this.f13672i[3] ? 0 : 8);
        this.f13669f.setVisibility(this.f13672i[4] ? 0 : 8);
        this.f13670g.setVisibility(this.f13672i[5] ? 0 : 8);
        m12784r();
    }

    /* renamed from: C */
    public void m12768C(boolean z9) {
        this.f13686w = z9;
    }

    /* renamed from: D */
    public void m12769D(int i9, int i10, int i11, int i12, int i13, int i14) {
        if (!this.f13686w) {
            m12772G(i9, i10, i11, i12, i13, i14);
        } else {
            int[] iArrM13809d = AbstractC8885b.m13809d(i9, i10 + 1, i11);
            m12767B(iArrM13809d[0], iArrM13809d[1] - 1, iArrM13809d[2], iArrM13809d[3] == 1, i12, i13, i14);
        }
    }

    /* renamed from: E */
    public void m12770E(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 != null) {
            int i9 = calendar2.get(1);
            int i10 = calendar2.get(2) + 1;
            int i11 = calendar2.get(5);
            int i12 = this.f13673j;
            if (i9 > i12) {
                this.f13674k = i9;
                this.f13676m = i10;
                this.f13678o = i11;
                return;
            } else {
                if (i9 == i12) {
                    int i13 = this.f13675l;
                    if (i10 > i13) {
                        this.f13674k = i9;
                        this.f13676m = i10;
                        this.f13678o = i11;
                        return;
                    } else {
                        if (i10 != i13 || i11 <= this.f13677n) {
                            return;
                        }
                        this.f13674k = i9;
                        this.f13676m = i10;
                        this.f13678o = i11;
                        return;
                    }
                }
                return;
            }
        }
        if (calendar == null || calendar2 != null) {
            if (calendar == null || calendar2 == null) {
                return;
            }
            this.f13673j = calendar.get(1);
            this.f13674k = calendar2.get(1);
            this.f13675l = calendar.get(2) + 1;
            this.f13676m = calendar2.get(2) + 1;
            this.f13677n = calendar.get(5);
            this.f13678o = calendar2.get(5);
            return;
        }
        int i14 = calendar.get(1);
        int i15 = calendar.get(2) + 1;
        int i16 = calendar.get(5);
        int i17 = this.f13674k;
        if (i14 < i17) {
            this.f13675l = i15;
            this.f13677n = i16;
            this.f13673j = i14;
        } else if (i14 == i17) {
            int i18 = this.f13676m;
            if (i15 < i18) {
                this.f13675l = i15;
                this.f13677n = i16;
                this.f13673j = i14;
            } else {
                if (i15 != i18 || i16 >= this.f13678o) {
                    return;
                }
                this.f13675l = i15;
                this.f13677n = i16;
                this.f13673j = i14;
            }
        }
    }

    /* renamed from: F */
    public final void m12771F(int i9, int i10, int i11, int i12, List list, List list2) {
        int currentItem = this.f13667d.getCurrentItem();
        if (list.contains(String.valueOf(i10))) {
            if (i12 > 31) {
                i12 = 31;
            }
            this.f13667d.setAdapter(new C8097b(i11, i12));
        } else if (list2.contains(String.valueOf(i10))) {
            if (i12 > 30) {
                i12 = 30;
            }
            this.f13667d.setAdapter(new C8097b(i11, i12));
        } else if ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) {
            if (i12 > 28) {
                i12 = 28;
            }
            this.f13667d.setAdapter(new C8097b(i11, i12));
        } else {
            if (i12 > 29) {
                i12 = 29;
            }
            this.f13667d.setAdapter(new C8097b(i11, i12));
        }
        if (currentItem > this.f13667d.getAdapter().mo12084a() - 1) {
            this.f13667d.setCurrentItem(this.f13667d.getAdapter().mo12084a() - 1);
        }
    }

    /* renamed from: G */
    public final void m12772G(int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        List listAsList = Arrays.asList("1", ExifInterface.GPS_MEASUREMENT_3D, "5", "7", "8", "10", "12");
        List listAsList2 = Arrays.asList("4", "6", "9", "11");
        this.f13679p = i9;
        WheelView wheelView = (WheelView) this.f13664a.findViewById(R$id.year);
        this.f13665b = wheelView;
        wheelView.setAdapter(new C8097b(this.f13673j, this.f13674k));
        this.f13665b.setCurrentItem(i9 - this.f13673j);
        this.f13665b.setGravity(this.f13671h);
        WheelView wheelView2 = (WheelView) this.f13664a.findViewById(R$id.month);
        this.f13666c = wheelView2;
        int i17 = this.f13673j;
        int i18 = this.f13674k;
        if (i17 == i18) {
            wheelView2.setAdapter(new C8097b(this.f13675l, this.f13676m));
            this.f13666c.setCurrentItem((i10 + 1) - this.f13675l);
        } else if (i9 == i17) {
            wheelView2.setAdapter(new C8097b(this.f13675l, 12));
            this.f13666c.setCurrentItem((i10 + 1) - this.f13675l);
        } else if (i9 == i18) {
            wheelView2.setAdapter(new C8097b(1, this.f13676m));
            this.f13666c.setCurrentItem(i10);
        } else {
            wheelView2.setAdapter(new C8097b(1, 12));
            this.f13666c.setCurrentItem(i10);
        }
        this.f13666c.setGravity(this.f13671h);
        this.f13667d = (WheelView) this.f13664a.findViewById(R$id.day);
        int i19 = this.f13673j;
        int i20 = this.f13674k;
        if (i19 == i20 && this.f13675l == this.f13676m) {
            int i21 = i10 + 1;
            if (listAsList.contains(String.valueOf(i21))) {
                if (this.f13678o > 31) {
                    this.f13678o = 31;
                }
                this.f13667d.setAdapter(new C8097b(this.f13677n, this.f13678o));
            } else if (listAsList2.contains(String.valueOf(i21))) {
                if (this.f13678o > 30) {
                    this.f13678o = 30;
                }
                this.f13667d.setAdapter(new C8097b(this.f13677n, this.f13678o));
            } else if ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) {
                if (this.f13678o > 28) {
                    this.f13678o = 28;
                }
                this.f13667d.setAdapter(new C8097b(this.f13677n, this.f13678o));
            } else {
                if (this.f13678o > 29) {
                    this.f13678o = 29;
                }
                this.f13667d.setAdapter(new C8097b(this.f13677n, this.f13678o));
            }
            this.f13667d.setCurrentItem(i11 - this.f13677n);
        } else if (i9 == i19 && (i16 = i10 + 1) == this.f13675l) {
            if (listAsList.contains(String.valueOf(i16))) {
                this.f13667d.setAdapter(new C8097b(this.f13677n, 31));
            } else if (listAsList2.contains(String.valueOf(i16))) {
                this.f13667d.setAdapter(new C8097b(this.f13677n, 30));
            } else if ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) {
                this.f13667d.setAdapter(new C8097b(this.f13677n, 28));
            } else {
                this.f13667d.setAdapter(new C8097b(this.f13677n, 29));
            }
            this.f13667d.setCurrentItem(i11 - this.f13677n);
        } else if (i9 == i20 && (i15 = i10 + 1) == this.f13676m) {
            if (listAsList.contains(String.valueOf(i15))) {
                if (this.f13678o > 31) {
                    this.f13678o = 31;
                }
                this.f13667d.setAdapter(new C8097b(1, this.f13678o));
            } else if (listAsList2.contains(String.valueOf(i15))) {
                if (this.f13678o > 30) {
                    this.f13678o = 30;
                }
                this.f13667d.setAdapter(new C8097b(1, this.f13678o));
            } else if ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) {
                if (this.f13678o > 28) {
                    this.f13678o = 28;
                }
                this.f13667d.setAdapter(new C8097b(1, this.f13678o));
            } else {
                if (this.f13678o > 29) {
                    this.f13678o = 29;
                }
                this.f13667d.setAdapter(new C8097b(1, this.f13678o));
            }
            this.f13667d.setCurrentItem(i11 - 1);
        } else {
            int i22 = i10 + 1;
            if (listAsList.contains(String.valueOf(i22))) {
                this.f13667d.setAdapter(new C8097b(1, 31));
            } else if (listAsList2.contains(String.valueOf(i22))) {
                this.f13667d.setAdapter(new C8097b(1, 30));
            } else if ((i9 % 4 != 0 || i9 % 100 == 0) && i9 % 400 != 0) {
                this.f13667d.setAdapter(new C8097b(1, 28));
            } else {
                this.f13667d.setAdapter(new C8097b(1, 29));
            }
            this.f13667d.setCurrentItem(i11 - 1);
        }
        this.f13667d.setGravity(this.f13671h);
        WheelView wheelView3 = (WheelView) this.f13664a.findViewById(R$id.hour);
        this.f13668e = wheelView3;
        wheelView3.setAdapter(new C8097b(0, 23));
        this.f13668e.setCurrentItem(i12);
        this.f13668e.setGravity(this.f13671h);
        WheelView wheelView4 = (WheelView) this.f13664a.findViewById(R$id.min);
        this.f13669f = wheelView4;
        wheelView4.setAdapter(new C8097b(0, 59));
        this.f13669f.setCurrentItem(i13);
        this.f13669f.setGravity(this.f13671h);
        WheelView wheelView5 = (WheelView) this.f13664a.findViewById(R$id.second);
        this.f13670g = wheelView5;
        wheelView5.setAdapter(new C8097b(0, 59));
        this.f13670g.setCurrentItem(i14);
        this.f13670g.setGravity(this.f13671h);
        this.f13665b.setOnItemSelectedListener(new c(listAsList, listAsList2));
        this.f13666c.setOnItemSelectedListener(new d(listAsList, listAsList2));
        m12783q(this.f13667d);
        m12783q(this.f13668e);
        m12783q(this.f13669f);
        m12783q(this.f13670g);
        boolean[] zArr = this.f13672i;
        if (zArr.length != 6) {
            throw new IllegalArgumentException("type[] length is not 6");
        }
        this.f13665b.setVisibility(zArr[0] ? 0 : 8);
        this.f13666c.setVisibility(this.f13672i[1] ? 0 : 8);
        this.f13667d.setVisibility(this.f13672i[2] ? 0 : 8);
        this.f13668e.setVisibility(this.f13672i[3] ? 0 : 8);
        this.f13669f.setVisibility(this.f13672i[4] ? 0 : 8);
        this.f13670g.setVisibility(this.f13672i[5] ? 0 : 8);
        m12784r();
    }

    /* renamed from: H */
    public void m12773H(int i9) {
        this.f13673j = i9;
    }

    /* renamed from: I */
    public final void m12774I() {
        this.f13667d.setTextColorCenter(this.f13682s);
        this.f13666c.setTextColorCenter(this.f13682s);
        this.f13665b.setTextColorCenter(this.f13682s);
        this.f13668e.setTextColorCenter(this.f13682s);
        this.f13669f.setTextColorCenter(this.f13682s);
        this.f13670g.setTextColorCenter(this.f13682s);
    }

    /* renamed from: J */
    public void m12775J(int i9) {
        this.f13682s = i9;
        m12774I();
    }

    /* renamed from: K */
    public final void m12776K() {
        this.f13667d.setTextColorOut(this.f13681r);
        this.f13666c.setTextColorOut(this.f13681r);
        this.f13665b.setTextColorOut(this.f13681r);
        this.f13668e.setTextColorOut(this.f13681r);
        this.f13669f.setTextColorOut(this.f13681r);
        this.f13670g.setTextColorOut(this.f13681r);
    }

    /* renamed from: L */
    public void m12777L(int i9) {
        this.f13681r = i9;
        m12776K();
    }

    /* renamed from: M */
    public void m12778M(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f13667d.setTextXOffset(i9);
        this.f13666c.setTextXOffset(i10);
        this.f13665b.setTextXOffset(i11);
        this.f13668e.setTextXOffset(i12);
        this.f13669f.setTextXOffset(i13);
        this.f13670g.setTextXOffset(i14);
    }

    /* renamed from: N */
    public void m12779N(View view) {
        this.f13664a = view;
    }

    /* renamed from: n */
    public final String m12780n() {
        int currentItem;
        boolean z9;
        StringBuilder sb = new StringBuilder();
        int currentItem2 = this.f13665b.getCurrentItem() + this.f13673j;
        if (AbstractC8884a.m13804g(currentItem2) == 0 || (this.f13666c.getCurrentItem() + 1) - AbstractC8884a.m13804g(currentItem2) <= 0) {
            int currentItem3 = this.f13666c.getCurrentItem();
            currentItem = currentItem3 + 1;
            z9 = false;
            int[] iArrM13807b = AbstractC8885b.m13807b(currentItem2, currentItem, this.f13667d.getCurrentItem() + 1, z9);
            sb.append(iArrM13807b[0]);
            sb.append("-");
            sb.append(iArrM13807b[1]);
            sb.append("-");
            sb.append(iArrM13807b[2]);
            sb.append(" ");
            sb.append(this.f13668e.getCurrentItem());
            sb.append(":");
            sb.append(this.f13669f.getCurrentItem());
            sb.append(":");
            sb.append(this.f13670g.getCurrentItem());
            return sb.toString();
        }
        if ((this.f13666c.getCurrentItem() + 1) - AbstractC8884a.m13804g(currentItem2) == 1) {
            currentItem = this.f13666c.getCurrentItem();
            z9 = true;
            int[] iArrM13807b2 = AbstractC8885b.m13807b(currentItem2, currentItem, this.f13667d.getCurrentItem() + 1, z9);
            sb.append(iArrM13807b2[0]);
            sb.append("-");
            sb.append(iArrM13807b2[1]);
            sb.append("-");
            sb.append(iArrM13807b2[2]);
            sb.append(" ");
            sb.append(this.f13668e.getCurrentItem());
            sb.append(":");
            sb.append(this.f13669f.getCurrentItem());
            sb.append(":");
            sb.append(this.f13670g.getCurrentItem());
            return sb.toString();
        }
        currentItem = this.f13666c.getCurrentItem();
        z9 = false;
        int[] iArrM13807b22 = AbstractC8885b.m13807b(currentItem2, currentItem, this.f13667d.getCurrentItem() + 1, z9);
        sb.append(iArrM13807b22[0]);
        sb.append("-");
        sb.append(iArrM13807b22[1]);
        sb.append("-");
        sb.append(iArrM13807b22[2]);
        sb.append(" ");
        sb.append(this.f13668e.getCurrentItem());
        sb.append(":");
        sb.append(this.f13669f.getCurrentItem());
        sb.append(":");
        sb.append(this.f13670g.getCurrentItem());
        return sb.toString();
    }

    /* renamed from: o */
    public String m12781o() {
        if (this.f13686w) {
            return m12780n();
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13679p == this.f13673j) {
            int currentItem = this.f13666c.getCurrentItem();
            int i9 = this.f13675l;
            if (currentItem + i9 == i9) {
                sb.append(this.f13665b.getCurrentItem() + this.f13673j);
                sb.append("-");
                sb.append(this.f13666c.getCurrentItem() + this.f13675l);
                sb.append("-");
                sb.append(this.f13667d.getCurrentItem() + this.f13677n);
                sb.append(" ");
                sb.append(this.f13668e.getCurrentItem());
                sb.append(":");
                sb.append(this.f13669f.getCurrentItem());
                sb.append(":");
                sb.append(this.f13670g.getCurrentItem());
            } else {
                sb.append(this.f13665b.getCurrentItem() + this.f13673j);
                sb.append("-");
                sb.append(this.f13666c.getCurrentItem() + this.f13675l);
                sb.append("-");
                sb.append(this.f13667d.getCurrentItem() + 1);
                sb.append(" ");
                sb.append(this.f13668e.getCurrentItem());
                sb.append(":");
                sb.append(this.f13669f.getCurrentItem());
                sb.append(":");
                sb.append(this.f13670g.getCurrentItem());
            }
        } else {
            sb.append(this.f13665b.getCurrentItem() + this.f13673j);
            sb.append("-");
            sb.append(this.f13666c.getCurrentItem() + 1);
            sb.append("-");
            sb.append(this.f13667d.getCurrentItem() + 1);
            sb.append(" ");
            sb.append(this.f13668e.getCurrentItem());
            sb.append(":");
            sb.append(this.f13669f.getCurrentItem());
            sb.append(":");
            sb.append(this.f13670g.getCurrentItem());
        }
        return sb.toString();
    }

    /* renamed from: p */
    public void m12782p(boolean z9) {
        this.f13667d.m6956h(z9);
        this.f13666c.m6956h(z9);
        this.f13665b.m6956h(z9);
        this.f13668e.m6956h(z9);
        this.f13669f.m6956h(z9);
        this.f13670g.m6956h(z9);
    }

    /* renamed from: q */
    public final void m12783q(WheelView wheelView) {
        if (this.f13687x != null) {
            wheelView.setOnItemSelectedListener(new e());
        }
    }

    /* renamed from: r */
    public final void m12784r() {
        this.f13667d.setTextSize(this.f13680q);
        this.f13666c.setTextSize(this.f13680q);
        this.f13665b.setTextSize(this.f13680q);
        this.f13668e.setTextSize(this.f13680q);
        this.f13669f.setTextSize(this.f13680q);
        this.f13670g.setTextSize(this.f13680q);
    }

    /* renamed from: s */
    public void m12785s(boolean z9) {
        this.f13665b.setCyclic(z9);
        this.f13666c.setCyclic(z9);
        this.f13667d.setCyclic(z9);
        this.f13668e.setCyclic(z9);
        this.f13669f.setCyclic(z9);
        this.f13670g.setCyclic(z9);
    }

    /* renamed from: t */
    public final void m12786t() {
        this.f13667d.setDividerColor(this.f13683t);
        this.f13666c.setDividerColor(this.f13683t);
        this.f13665b.setDividerColor(this.f13683t);
        this.f13668e.setDividerColor(this.f13683t);
        this.f13669f.setDividerColor(this.f13683t);
        this.f13670g.setDividerColor(this.f13683t);
    }

    /* renamed from: u */
    public void m12787u(int i9) {
        this.f13683t = i9;
        m12786t();
    }

    /* renamed from: v */
    public final void m12788v() {
        this.f13667d.setDividerType(this.f13685v);
        this.f13666c.setDividerType(this.f13685v);
        this.f13665b.setDividerType(this.f13685v);
        this.f13668e.setDividerType(this.f13685v);
        this.f13669f.setDividerType(this.f13685v);
        this.f13670g.setDividerType(this.f13685v);
    }

    /* renamed from: w */
    public void m12789w(WheelView.DividerType dividerType) {
        this.f13685v = dividerType;
        m12788v();
    }

    /* renamed from: x */
    public void m12790x(int i9) {
        this.f13674k = i9;
    }

    /* renamed from: y */
    public void m12791y(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f13686w) {
            return;
        }
        if (str != null) {
            this.f13665b.setLabel(str);
        } else {
            this.f13665b.setLabel(this.f13664a.getContext().getString(R$string.xui_picker_view_year));
        }
        if (str2 != null) {
            this.f13666c.setLabel(str2);
        } else {
            this.f13666c.setLabel(this.f13664a.getContext().getString(R$string.xui_picker_view_month));
        }
        if (str3 != null) {
            this.f13667d.setLabel(str3);
        } else {
            this.f13667d.setLabel(this.f13664a.getContext().getString(R$string.xui_picker_view_day));
        }
        if (str4 != null) {
            this.f13668e.setLabel(str4);
        } else {
            this.f13668e.setLabel(this.f13664a.getContext().getString(R$string.xui_picker_view_hours));
        }
        if (str5 != null) {
            this.f13669f.setLabel(str5);
        } else {
            this.f13669f.setLabel(this.f13664a.getContext().getString(R$string.xui_picker_view_minutes));
        }
        if (str6 != null) {
            this.f13670g.setLabel(str6);
        } else {
            this.f13670g.setLabel(this.f13664a.getContext().getString(R$string.xui_picker_view_seconds));
        }
    }

    /* renamed from: z */
    public final void m12792z() {
        this.f13667d.setLineSpacingMultiplier(this.f13684u);
        this.f13666c.setLineSpacingMultiplier(this.f13684u);
        this.f13665b.setLineSpacingMultiplier(this.f13684u);
        this.f13668e.setLineSpacingMultiplier(this.f13684u);
        this.f13669f.setLineSpacingMultiplier(this.f13684u);
        this.f13670g.setLineSpacingMultiplier(this.f13684u);
    }
}
