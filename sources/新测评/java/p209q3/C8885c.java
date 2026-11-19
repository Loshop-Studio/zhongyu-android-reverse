package p209q3;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import p187o3.InterfaceC8699b;
import p220r3.C9003a;
import p220r3.C9004b;
import p253u3.InterfaceC9538a;
import p264v3.AbstractC9662a;
import p264v3.AbstractC9663b;

/* renamed from: q3.c */
/* loaded from: classes4.dex */
public class C8885c {

    /* renamed from: y */
    public static DateFormat f15151y = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a */
    public View f15152a;

    /* renamed from: b */
    public WheelView f15153b;

    /* renamed from: c */
    public WheelView f15154c;

    /* renamed from: d */
    public WheelView f15155d;

    /* renamed from: e */
    public WheelView f15156e;

    /* renamed from: f */
    public WheelView f15157f;

    /* renamed from: g */
    public WheelView f15158g;

    /* renamed from: h */
    public int f15159h;

    /* renamed from: i */
    public boolean[] f15160i;

    /* renamed from: p */
    public int f15167p;

    /* renamed from: q */
    public int f15168q;

    /* renamed from: r */
    public int f15169r;

    /* renamed from: s */
    public int f15170s;

    /* renamed from: t */
    public int f15171t;

    /* renamed from: u */
    public float f15172u;

    /* renamed from: v */
    public WheelView.DividerType f15173v;

    /* renamed from: x */
    public InterfaceC9538a f15175x;

    /* renamed from: j */
    public int f15161j = 1900;

    /* renamed from: k */
    public int f15162k = 2100;

    /* renamed from: l */
    public int f15163l = 1;

    /* renamed from: m */
    public int f15164m = 12;

    /* renamed from: n */
    public int f15165n = 1;

    /* renamed from: o */
    public int f15166o = 31;

    /* renamed from: w */
    public boolean f15174w = false;

    /* renamed from: q3.c$a */
    public class a implements InterfaceC8699b {
        public a() {
        }

        @Override // p187o3.InterfaceC8699b
        /* renamed from: a */
        public void mo14305a(int i10) {
            int iM16160h;
            int i11 = i10 + C8885c.this.f15161j;
            C8885c.this.f15154c.setAdapter(new C9003a(AbstractC9662a.m16156d(i11)));
            if (AbstractC9662a.m16159g(i11) == 0 || C8885c.this.f15154c.getCurrentItem() <= AbstractC9662a.m16159g(i11) - 1) {
                C8885c.this.f15154c.setCurrentItem(C8885c.this.f15154c.getCurrentItem());
            } else {
                C8885c.this.f15154c.setCurrentItem(C8885c.this.f15154c.getCurrentItem() + 1);
            }
            if (AbstractC9662a.m16159g(i11) == 0 || C8885c.this.f15154c.getCurrentItem() <= AbstractC9662a.m16159g(i11) - 1) {
                C8885c.this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16160h(i11, C8885c.this.f15154c.getCurrentItem() + 1))));
                iM16160h = AbstractC9662a.m16160h(i11, C8885c.this.f15154c.getCurrentItem() + 1);
            } else if (C8885c.this.f15154c.getCurrentItem() == AbstractC9662a.m16159g(i11) + 1) {
                C8885c.this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16158f(i11))));
                iM16160h = AbstractC9662a.m16158f(i11);
            } else {
                C8885c.this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16160h(i11, C8885c.this.f15154c.getCurrentItem()))));
                iM16160h = AbstractC9662a.m16160h(i11, C8885c.this.f15154c.getCurrentItem());
            }
            int i12 = iM16160h - 1;
            if (C8885c.this.f15155d.getCurrentItem() > i12) {
                C8885c.this.f15155d.setCurrentItem(i12);
            }
            if (C8885c.this.f15175x != null) {
                C8885c.this.f15175x.m15974a();
            }
        }
    }

    /* renamed from: q3.c$b */
    public class b implements InterfaceC8699b {
        public b() {
        }

        @Override // p187o3.InterfaceC8699b
        /* renamed from: a */
        public void mo14305a(int i10) {
            int iM16160h;
            int currentItem = C8885c.this.f15153b.getCurrentItem() + C8885c.this.f15161j;
            if (AbstractC9662a.m16159g(currentItem) == 0 || i10 <= AbstractC9662a.m16159g(currentItem) - 1) {
                int i11 = i10 + 1;
                C8885c.this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16160h(currentItem, i11))));
                iM16160h = AbstractC9662a.m16160h(currentItem, i11);
            } else if (C8885c.this.f15154c.getCurrentItem() == AbstractC9662a.m16159g(currentItem) + 1) {
                C8885c.this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16158f(currentItem))));
                iM16160h = AbstractC9662a.m16158f(currentItem);
            } else {
                C8885c.this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16160h(currentItem, i10))));
                iM16160h = AbstractC9662a.m16160h(currentItem, i10);
            }
            int i12 = iM16160h - 1;
            if (C8885c.this.f15155d.getCurrentItem() > i12) {
                C8885c.this.f15155d.setCurrentItem(i12);
            }
            if (C8885c.this.f15175x != null) {
                C8885c.this.f15175x.m15974a();
            }
        }
    }

    /* renamed from: q3.c$c */
    public class c implements InterfaceC8699b {

        /* renamed from: a */
        public final /* synthetic */ List f15178a;

        /* renamed from: b */
        public final /* synthetic */ List f15179b;

        public c(List list, List list2) {
            this.f15178a = list;
            this.f15179b = list2;
        }

        @Override // p187o3.InterfaceC8699b
        /* renamed from: a */
        public void mo14305a(int i10) {
            int i11 = i10 + C8885c.this.f15161j;
            C8885c.this.f15167p = i11;
            int currentItem = C8885c.this.f15154c.getCurrentItem();
            if (C8885c.this.f15161j == C8885c.this.f15162k) {
                C8885c.this.f15154c.setAdapter(new C9004b(C8885c.this.f15163l, C8885c.this.f15164m));
                if (currentItem > C8885c.this.f15154c.getAdapter().mo14192a() - 1) {
                    currentItem = C8885c.this.f15154c.getAdapter().mo14192a() - 1;
                    C8885c.this.f15154c.setCurrentItem(currentItem);
                }
                int i12 = currentItem + C8885c.this.f15163l;
                if (C8885c.this.f15163l == C8885c.this.f15164m) {
                    C8885c c8885c = C8885c.this;
                    c8885c.m14970F(i11, i12, c8885c.f15165n, C8885c.this.f15166o, this.f15178a, this.f15179b);
                } else if (i12 == C8885c.this.f15163l) {
                    C8885c c8885c2 = C8885c.this;
                    c8885c2.m14970F(i11, i12, c8885c2.f15165n, 31, this.f15178a, this.f15179b);
                } else if (i12 == C8885c.this.f15164m) {
                    C8885c c8885c3 = C8885c.this;
                    c8885c3.m14970F(i11, i12, 1, c8885c3.f15166o, this.f15178a, this.f15179b);
                } else {
                    C8885c.this.m14970F(i11, i12, 1, 31, this.f15178a, this.f15179b);
                }
            } else if (i11 == C8885c.this.f15161j) {
                C8885c.this.f15154c.setAdapter(new C9004b(C8885c.this.f15163l, 12));
                if (currentItem > C8885c.this.f15154c.getAdapter().mo14192a() - 1) {
                    currentItem = C8885c.this.f15154c.getAdapter().mo14192a() - 1;
                    C8885c.this.f15154c.setCurrentItem(currentItem);
                }
                int i13 = currentItem + C8885c.this.f15163l;
                if (i13 == C8885c.this.f15163l) {
                    C8885c c8885c4 = C8885c.this;
                    c8885c4.m14970F(i11, i13, c8885c4.f15165n, 31, this.f15178a, this.f15179b);
                } else {
                    C8885c.this.m14970F(i11, i13, 1, 31, this.f15178a, this.f15179b);
                }
            } else if (i11 == C8885c.this.f15162k) {
                C8885c.this.f15154c.setAdapter(new C9004b(1, C8885c.this.f15164m));
                if (currentItem > C8885c.this.f15154c.getAdapter().mo14192a() - 1) {
                    currentItem = C8885c.this.f15154c.getAdapter().mo14192a() - 1;
                    C8885c.this.f15154c.setCurrentItem(currentItem);
                }
                int i14 = 1 + currentItem;
                if (i14 == C8885c.this.f15164m) {
                    C8885c c8885c5 = C8885c.this;
                    c8885c5.m14970F(i11, i14, 1, c8885c5.f15166o, this.f15178a, this.f15179b);
                } else {
                    C8885c.this.m14970F(i11, i14, 1, 31, this.f15178a, this.f15179b);
                }
            } else {
                C8885c.this.f15154c.setAdapter(new C9004b(1, 12));
                C8885c c8885c6 = C8885c.this;
                c8885c6.m14970F(i11, 1 + c8885c6.f15154c.getCurrentItem(), 1, 31, this.f15178a, this.f15179b);
            }
            if (C8885c.this.f15175x != null) {
                C8885c.this.f15175x.m15974a();
            }
        }
    }

    /* renamed from: q3.c$d */
    public class d implements InterfaceC8699b {

        /* renamed from: a */
        public final /* synthetic */ List f15181a;

        /* renamed from: b */
        public final /* synthetic */ List f15182b;

        public d(List list, List list2) {
            this.f15181a = list;
            this.f15182b = list2;
        }

        @Override // p187o3.InterfaceC8699b
        /* renamed from: a */
        public void mo14305a(int i10) {
            int i11 = i10 + 1;
            if (C8885c.this.f15161j == C8885c.this.f15162k) {
                int i12 = (i11 + C8885c.this.f15163l) - 1;
                if (C8885c.this.f15163l == C8885c.this.f15164m) {
                    C8885c c8885c = C8885c.this;
                    c8885c.m14970F(c8885c.f15167p, i12, C8885c.this.f15165n, C8885c.this.f15166o, this.f15181a, this.f15182b);
                } else if (C8885c.this.f15163l == i12) {
                    C8885c c8885c2 = C8885c.this;
                    c8885c2.m14970F(c8885c2.f15167p, i12, C8885c.this.f15165n, 31, this.f15181a, this.f15182b);
                } else if (C8885c.this.f15164m == i12) {
                    C8885c c8885c3 = C8885c.this;
                    c8885c3.m14970F(c8885c3.f15167p, i12, 1, C8885c.this.f15166o, this.f15181a, this.f15182b);
                } else {
                    C8885c c8885c4 = C8885c.this;
                    c8885c4.m14970F(c8885c4.f15167p, i12, 1, 31, this.f15181a, this.f15182b);
                }
            } else if (C8885c.this.f15167p == C8885c.this.f15161j) {
                int i13 = (i11 + C8885c.this.f15163l) - 1;
                if (i13 == C8885c.this.f15163l) {
                    C8885c c8885c5 = C8885c.this;
                    c8885c5.m14970F(c8885c5.f15167p, i13, C8885c.this.f15165n, 31, this.f15181a, this.f15182b);
                } else {
                    C8885c c8885c6 = C8885c.this;
                    c8885c6.m14970F(c8885c6.f15167p, i13, 1, 31, this.f15181a, this.f15182b);
                }
            } else if (C8885c.this.f15167p != C8885c.this.f15162k) {
                C8885c c8885c7 = C8885c.this;
                c8885c7.m14970F(c8885c7.f15167p, i11, 1, 31, this.f15181a, this.f15182b);
            } else if (i11 == C8885c.this.f15164m) {
                C8885c c8885c8 = C8885c.this;
                c8885c8.m14970F(c8885c8.f15167p, C8885c.this.f15154c.getCurrentItem() + 1, 1, C8885c.this.f15166o, this.f15181a, this.f15182b);
            } else {
                C8885c c8885c9 = C8885c.this;
                c8885c9.m14970F(c8885c9.f15167p, C8885c.this.f15154c.getCurrentItem() + 1, 1, 31, this.f15181a, this.f15182b);
            }
            if (C8885c.this.f15175x != null) {
                C8885c.this.f15175x.m15974a();
            }
        }
    }

    /* renamed from: q3.c$e */
    public class e implements InterfaceC8699b {
        public e() {
        }

        @Override // p187o3.InterfaceC8699b
        /* renamed from: a */
        public void mo14305a(int i10) {
            C8885c.this.f15175x.m15974a();
        }
    }

    public C8885c(View view, boolean[] zArr, int i10, int i11) {
        this.f15152a = view;
        this.f15160i = zArr;
        this.f15159h = i10;
        this.f15168q = i11;
        m14978N(view);
    }

    /* renamed from: A */
    public void m14965A(float f10) {
        this.f15172u = f10;
        m14991z();
    }

    /* renamed from: B */
    public final void m14966B(int i10, int i11, int i12, boolean z9, int i13, int i14, int i15) {
        WheelView wheelView = (WheelView) this.f15152a.findViewById(R$id.year);
        this.f15153b = wheelView;
        wheelView.setAdapter(new C9003a(AbstractC9662a.m16157e(this.f15161j, this.f15162k)));
        this.f15153b.setLabel("");
        this.f15153b.setCurrentItem(i10 - this.f15161j);
        this.f15153b.setGravity(this.f15159h);
        WheelView wheelView2 = (WheelView) this.f15152a.findViewById(R$id.month);
        this.f15154c = wheelView2;
        wheelView2.setAdapter(new C9003a(AbstractC9662a.m16156d(i10)));
        this.f15154c.setLabel("");
        int iM16159g = AbstractC9662a.m16159g(i10);
        if (iM16159g == 0 || (i11 <= iM16159g - 1 && !z9)) {
            this.f15154c.setCurrentItem(i11);
        } else {
            this.f15154c.setCurrentItem(i11 + 1);
        }
        this.f15154c.setGravity(this.f15159h);
        this.f15155d = (WheelView) this.f15152a.findViewById(R$id.day);
        if (AbstractC9662a.m16159g(i10) == 0) {
            this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16160h(i10, i11))));
        } else {
            this.f15155d.setAdapter(new C9003a(AbstractC9662a.m16154b(AbstractC9662a.m16158f(i10))));
        }
        this.f15155d.setLabel("");
        this.f15155d.setCurrentItem(i12 - 1);
        this.f15155d.setGravity(this.f15159h);
        WheelView wheelView3 = (WheelView) this.f15152a.findViewById(R$id.hour);
        this.f15156e = wheelView3;
        wheelView3.setAdapter(new C9004b(0, 23));
        this.f15156e.setCurrentItem(i13);
        this.f15156e.setGravity(this.f15159h);
        WheelView wheelView4 = (WheelView) this.f15152a.findViewById(R$id.min);
        this.f15157f = wheelView4;
        wheelView4.setAdapter(new C9004b(0, 59));
        this.f15157f.setCurrentItem(i14);
        this.f15157f.setGravity(this.f15159h);
        WheelView wheelView5 = (WheelView) this.f15152a.findViewById(R$id.second);
        this.f15158g = wheelView5;
        wheelView5.setAdapter(new C9004b(0, 59));
        this.f15158g.setCurrentItem(i14);
        this.f15158g.setGravity(this.f15159h);
        this.f15153b.setOnItemSelectedListener(new a());
        this.f15154c.setOnItemSelectedListener(new b());
        m14982q(this.f15155d);
        m14982q(this.f15156e);
        m14982q(this.f15157f);
        m14982q(this.f15158g);
        boolean[] zArr = this.f15160i;
        if (zArr.length != 6) {
            throw new RuntimeException("type[] length is not 6");
        }
        this.f15153b.setVisibility(zArr[0] ? 0 : 8);
        this.f15154c.setVisibility(this.f15160i[1] ? 0 : 8);
        this.f15155d.setVisibility(this.f15160i[2] ? 0 : 8);
        this.f15156e.setVisibility(this.f15160i[3] ? 0 : 8);
        this.f15157f.setVisibility(this.f15160i[4] ? 0 : 8);
        this.f15158g.setVisibility(this.f15160i[5] ? 0 : 8);
        m14983r();
    }

    /* renamed from: C */
    public void m14967C(boolean z9) {
        this.f15174w = z9;
    }

    /* renamed from: D */
    public void m14968D(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (!this.f15174w) {
            m14971G(i10, i11, i12, i13, i14, i15);
        } else {
            int[] iArrM16164d = AbstractC9663b.m16164d(i10, i11 + 1, i12);
            m14966B(iArrM16164d[0], iArrM16164d[1] - 1, iArrM16164d[2], iArrM16164d[3] == 1, i13, i14, i15);
        }
    }

    /* renamed from: E */
    public void m14969E(Calendar calendar, Calendar calendar2) {
        if (calendar == null && calendar2 != null) {
            int i10 = calendar2.get(1);
            int i11 = calendar2.get(2) + 1;
            int i12 = calendar2.get(5);
            int i13 = this.f15161j;
            if (i10 > i13) {
                this.f15162k = i10;
                this.f15164m = i11;
                this.f15166o = i12;
                return;
            } else {
                if (i10 == i13) {
                    int i14 = this.f15163l;
                    if (i11 > i14) {
                        this.f15162k = i10;
                        this.f15164m = i11;
                        this.f15166o = i12;
                        return;
                    } else {
                        if (i11 != i14 || i12 <= this.f15165n) {
                            return;
                        }
                        this.f15162k = i10;
                        this.f15164m = i11;
                        this.f15166o = i12;
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
            this.f15161j = calendar.get(1);
            this.f15162k = calendar2.get(1);
            this.f15163l = calendar.get(2) + 1;
            this.f15164m = calendar2.get(2) + 1;
            this.f15165n = calendar.get(5);
            this.f15166o = calendar2.get(5);
            return;
        }
        int i15 = calendar.get(1);
        int i16 = calendar.get(2) + 1;
        int i17 = calendar.get(5);
        int i18 = this.f15162k;
        if (i15 < i18) {
            this.f15163l = i16;
            this.f15165n = i17;
            this.f15161j = i15;
        } else if (i15 == i18) {
            int i19 = this.f15164m;
            if (i16 < i19) {
                this.f15163l = i16;
                this.f15165n = i17;
                this.f15161j = i15;
            } else {
                if (i16 != i19 || i17 >= this.f15166o) {
                    return;
                }
                this.f15163l = i16;
                this.f15165n = i17;
                this.f15161j = i15;
            }
        }
    }

    /* renamed from: F */
    public final void m14970F(int i10, int i11, int i12, int i13, List list, List list2) {
        int currentItem = this.f15155d.getCurrentItem();
        if (list.contains(String.valueOf(i11))) {
            if (i13 > 31) {
                i13 = 31;
            }
            this.f15155d.setAdapter(new C9004b(i12, i13));
        } else if (list2.contains(String.valueOf(i11))) {
            if (i13 > 30) {
                i13 = 30;
            }
            this.f15155d.setAdapter(new C9004b(i12, i13));
        } else if ((i10 % 4 != 0 || i10 % 100 == 0) && i10 % 400 != 0) {
            if (i13 > 28) {
                i13 = 28;
            }
            this.f15155d.setAdapter(new C9004b(i12, i13));
        } else {
            if (i13 > 29) {
                i13 = 29;
            }
            this.f15155d.setAdapter(new C9004b(i12, i13));
        }
        if (currentItem > this.f15155d.getAdapter().mo14192a() - 1) {
            this.f15155d.setCurrentItem(this.f15155d.getAdapter().mo14192a() - 1);
        }
    }

    /* renamed from: G */
    public final void m14971G(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        List listAsList = Arrays.asList("1", ExifInterface.GPS_MEASUREMENT_3D, "5", "7", "8", "10", "12");
        List listAsList2 = Arrays.asList("4", "6", "9", "11");
        this.f15167p = i10;
        WheelView wheelView = (WheelView) this.f15152a.findViewById(R$id.year);
        this.f15153b = wheelView;
        wheelView.setAdapter(new C9004b(this.f15161j, this.f15162k));
        this.f15153b.setCurrentItem(i10 - this.f15161j);
        this.f15153b.setGravity(this.f15159h);
        WheelView wheelView2 = (WheelView) this.f15152a.findViewById(R$id.month);
        this.f15154c = wheelView2;
        int i18 = this.f15161j;
        int i19 = this.f15162k;
        if (i18 == i19) {
            wheelView2.setAdapter(new C9004b(this.f15163l, this.f15164m));
            this.f15154c.setCurrentItem((i11 + 1) - this.f15163l);
        } else if (i10 == i18) {
            wheelView2.setAdapter(new C9004b(this.f15163l, 12));
            this.f15154c.setCurrentItem((i11 + 1) - this.f15163l);
        } else if (i10 == i19) {
            wheelView2.setAdapter(new C9004b(1, this.f15164m));
            this.f15154c.setCurrentItem(i11);
        } else {
            wheelView2.setAdapter(new C9004b(1, 12));
            this.f15154c.setCurrentItem(i11);
        }
        this.f15154c.setGravity(this.f15159h);
        this.f15155d = (WheelView) this.f15152a.findViewById(R$id.day);
        int i20 = this.f15161j;
        int i21 = this.f15162k;
        if (i20 == i21 && this.f15163l == this.f15164m) {
            int i22 = i11 + 1;
            if (listAsList.contains(String.valueOf(i22))) {
                if (this.f15166o > 31) {
                    this.f15166o = 31;
                }
                this.f15155d.setAdapter(new C9004b(this.f15165n, this.f15166o));
            } else if (listAsList2.contains(String.valueOf(i22))) {
                if (this.f15166o > 30) {
                    this.f15166o = 30;
                }
                this.f15155d.setAdapter(new C9004b(this.f15165n, this.f15166o));
            } else if ((i10 % 4 != 0 || i10 % 100 == 0) && i10 % 400 != 0) {
                if (this.f15166o > 28) {
                    this.f15166o = 28;
                }
                this.f15155d.setAdapter(new C9004b(this.f15165n, this.f15166o));
            } else {
                if (this.f15166o > 29) {
                    this.f15166o = 29;
                }
                this.f15155d.setAdapter(new C9004b(this.f15165n, this.f15166o));
            }
            this.f15155d.setCurrentItem(i12 - this.f15165n);
        } else if (i10 == i20 && (i17 = i11 + 1) == this.f15163l) {
            if (listAsList.contains(String.valueOf(i17))) {
                this.f15155d.setAdapter(new C9004b(this.f15165n, 31));
            } else if (listAsList2.contains(String.valueOf(i17))) {
                this.f15155d.setAdapter(new C9004b(this.f15165n, 30));
            } else if ((i10 % 4 != 0 || i10 % 100 == 0) && i10 % 400 != 0) {
                this.f15155d.setAdapter(new C9004b(this.f15165n, 28));
            } else {
                this.f15155d.setAdapter(new C9004b(this.f15165n, 29));
            }
            this.f15155d.setCurrentItem(i12 - this.f15165n);
        } else if (i10 == i21 && (i16 = i11 + 1) == this.f15164m) {
            if (listAsList.contains(String.valueOf(i16))) {
                if (this.f15166o > 31) {
                    this.f15166o = 31;
                }
                this.f15155d.setAdapter(new C9004b(1, this.f15166o));
            } else if (listAsList2.contains(String.valueOf(i16))) {
                if (this.f15166o > 30) {
                    this.f15166o = 30;
                }
                this.f15155d.setAdapter(new C9004b(1, this.f15166o));
            } else if ((i10 % 4 != 0 || i10 % 100 == 0) && i10 % 400 != 0) {
                if (this.f15166o > 28) {
                    this.f15166o = 28;
                }
                this.f15155d.setAdapter(new C9004b(1, this.f15166o));
            } else {
                if (this.f15166o > 29) {
                    this.f15166o = 29;
                }
                this.f15155d.setAdapter(new C9004b(1, this.f15166o));
            }
            this.f15155d.setCurrentItem(i12 - 1);
        } else {
            int i23 = i11 + 1;
            if (listAsList.contains(String.valueOf(i23))) {
                this.f15155d.setAdapter(new C9004b(1, 31));
            } else if (listAsList2.contains(String.valueOf(i23))) {
                this.f15155d.setAdapter(new C9004b(1, 30));
            } else if ((i10 % 4 != 0 || i10 % 100 == 0) && i10 % 400 != 0) {
                this.f15155d.setAdapter(new C9004b(1, 28));
            } else {
                this.f15155d.setAdapter(new C9004b(1, 29));
            }
            this.f15155d.setCurrentItem(i12 - 1);
        }
        this.f15155d.setGravity(this.f15159h);
        WheelView wheelView3 = (WheelView) this.f15152a.findViewById(R$id.hour);
        this.f15156e = wheelView3;
        wheelView3.setAdapter(new C9004b(0, 23));
        this.f15156e.setCurrentItem(i13);
        this.f15156e.setGravity(this.f15159h);
        WheelView wheelView4 = (WheelView) this.f15152a.findViewById(R$id.min);
        this.f15157f = wheelView4;
        wheelView4.setAdapter(new C9004b(0, 59));
        this.f15157f.setCurrentItem(i14);
        this.f15157f.setGravity(this.f15159h);
        WheelView wheelView5 = (WheelView) this.f15152a.findViewById(R$id.second);
        this.f15158g = wheelView5;
        wheelView5.setAdapter(new C9004b(0, 59));
        this.f15158g.setCurrentItem(i15);
        this.f15158g.setGravity(this.f15159h);
        this.f15153b.setOnItemSelectedListener(new c(listAsList, listAsList2));
        this.f15154c.setOnItemSelectedListener(new d(listAsList, listAsList2));
        m14982q(this.f15155d);
        m14982q(this.f15156e);
        m14982q(this.f15157f);
        m14982q(this.f15158g);
        boolean[] zArr = this.f15160i;
        if (zArr.length != 6) {
            throw new IllegalArgumentException("type[] length is not 6");
        }
        this.f15153b.setVisibility(zArr[0] ? 0 : 8);
        this.f15154c.setVisibility(this.f15160i[1] ? 0 : 8);
        this.f15155d.setVisibility(this.f15160i[2] ? 0 : 8);
        this.f15156e.setVisibility(this.f15160i[3] ? 0 : 8);
        this.f15157f.setVisibility(this.f15160i[4] ? 0 : 8);
        this.f15158g.setVisibility(this.f15160i[5] ? 0 : 8);
        m14983r();
    }

    /* renamed from: H */
    public void m14972H(int i10) {
        this.f15161j = i10;
    }

    /* renamed from: I */
    public final void m14973I() {
        this.f15155d.setTextColorCenter(this.f15170s);
        this.f15154c.setTextColorCenter(this.f15170s);
        this.f15153b.setTextColorCenter(this.f15170s);
        this.f15156e.setTextColorCenter(this.f15170s);
        this.f15157f.setTextColorCenter(this.f15170s);
        this.f15158g.setTextColorCenter(this.f15170s);
    }

    /* renamed from: J */
    public void m14974J(int i10) {
        this.f15170s = i10;
        m14973I();
    }

    /* renamed from: K */
    public final void m14975K() {
        this.f15155d.setTextColorOut(this.f15169r);
        this.f15154c.setTextColorOut(this.f15169r);
        this.f15153b.setTextColorOut(this.f15169r);
        this.f15156e.setTextColorOut(this.f15169r);
        this.f15157f.setTextColorOut(this.f15169r);
        this.f15158g.setTextColorOut(this.f15169r);
    }

    /* renamed from: L */
    public void m14976L(int i10) {
        this.f15169r = i10;
        m14975K();
    }

    /* renamed from: M */
    public void m14977M(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f15155d.setTextXOffset(i10);
        this.f15154c.setTextXOffset(i11);
        this.f15153b.setTextXOffset(i12);
        this.f15156e.setTextXOffset(i13);
        this.f15157f.setTextXOffset(i14);
        this.f15158g.setTextXOffset(i15);
    }

    /* renamed from: N */
    public void m14978N(View view) {
        this.f15152a = view;
    }

    /* renamed from: n */
    public final String m14979n() {
        int currentItem;
        boolean z9;
        StringBuilder sb = new StringBuilder();
        int currentItem2 = this.f15153b.getCurrentItem() + this.f15161j;
        if (AbstractC9662a.m16159g(currentItem2) == 0 || (this.f15154c.getCurrentItem() + 1) - AbstractC9662a.m16159g(currentItem2) <= 0) {
            int currentItem3 = this.f15154c.getCurrentItem();
            currentItem = currentItem3 + 1;
            z9 = false;
            int[] iArrM16162b = AbstractC9663b.m16162b(currentItem2, currentItem, this.f15155d.getCurrentItem() + 1, z9);
            sb.append(iArrM16162b[0]);
            sb.append("-");
            sb.append(iArrM16162b[1]);
            sb.append("-");
            sb.append(iArrM16162b[2]);
            sb.append(" ");
            sb.append(this.f15156e.getCurrentItem());
            sb.append(":");
            sb.append(this.f15157f.getCurrentItem());
            sb.append(":");
            sb.append(this.f15158g.getCurrentItem());
            return sb.toString();
        }
        if ((this.f15154c.getCurrentItem() + 1) - AbstractC9662a.m16159g(currentItem2) == 1) {
            currentItem = this.f15154c.getCurrentItem();
            z9 = true;
            int[] iArrM16162b2 = AbstractC9663b.m16162b(currentItem2, currentItem, this.f15155d.getCurrentItem() + 1, z9);
            sb.append(iArrM16162b2[0]);
            sb.append("-");
            sb.append(iArrM16162b2[1]);
            sb.append("-");
            sb.append(iArrM16162b2[2]);
            sb.append(" ");
            sb.append(this.f15156e.getCurrentItem());
            sb.append(":");
            sb.append(this.f15157f.getCurrentItem());
            sb.append(":");
            sb.append(this.f15158g.getCurrentItem());
            return sb.toString();
        }
        currentItem = this.f15154c.getCurrentItem();
        z9 = false;
        int[] iArrM16162b22 = AbstractC9663b.m16162b(currentItem2, currentItem, this.f15155d.getCurrentItem() + 1, z9);
        sb.append(iArrM16162b22[0]);
        sb.append("-");
        sb.append(iArrM16162b22[1]);
        sb.append("-");
        sb.append(iArrM16162b22[2]);
        sb.append(" ");
        sb.append(this.f15156e.getCurrentItem());
        sb.append(":");
        sb.append(this.f15157f.getCurrentItem());
        sb.append(":");
        sb.append(this.f15158g.getCurrentItem());
        return sb.toString();
    }

    /* renamed from: o */
    public String m14980o() {
        if (this.f15174w) {
            return m14979n();
        }
        StringBuilder sb = new StringBuilder();
        if (this.f15167p == this.f15161j) {
            int currentItem = this.f15154c.getCurrentItem();
            int i10 = this.f15163l;
            if (currentItem + i10 == i10) {
                sb.append(this.f15153b.getCurrentItem() + this.f15161j);
                sb.append("-");
                sb.append(this.f15154c.getCurrentItem() + this.f15163l);
                sb.append("-");
                sb.append(this.f15155d.getCurrentItem() + this.f15165n);
                sb.append(" ");
                sb.append(this.f15156e.getCurrentItem());
                sb.append(":");
                sb.append(this.f15157f.getCurrentItem());
                sb.append(":");
                sb.append(this.f15158g.getCurrentItem());
            } else {
                sb.append(this.f15153b.getCurrentItem() + this.f15161j);
                sb.append("-");
                sb.append(this.f15154c.getCurrentItem() + this.f15163l);
                sb.append("-");
                sb.append(this.f15155d.getCurrentItem() + 1);
                sb.append(" ");
                sb.append(this.f15156e.getCurrentItem());
                sb.append(":");
                sb.append(this.f15157f.getCurrentItem());
                sb.append(":");
                sb.append(this.f15158g.getCurrentItem());
            }
        } else {
            sb.append(this.f15153b.getCurrentItem() + this.f15161j);
            sb.append("-");
            sb.append(this.f15154c.getCurrentItem() + 1);
            sb.append("-");
            sb.append(this.f15155d.getCurrentItem() + 1);
            sb.append(" ");
            sb.append(this.f15156e.getCurrentItem());
            sb.append(":");
            sb.append(this.f15157f.getCurrentItem());
            sb.append(":");
            sb.append(this.f15158g.getCurrentItem());
        }
        return sb.toString();
    }

    /* renamed from: p */
    public void m14981p(boolean z9) {
        this.f15155d.m5858h(z9);
        this.f15154c.m5858h(z9);
        this.f15153b.m5858h(z9);
        this.f15156e.m5858h(z9);
        this.f15157f.m5858h(z9);
        this.f15158g.m5858h(z9);
    }

    /* renamed from: q */
    public final void m14982q(WheelView wheelView) {
        if (this.f15175x != null) {
            wheelView.setOnItemSelectedListener(new e());
        }
    }

    /* renamed from: r */
    public final void m14983r() {
        this.f15155d.setTextSize(this.f15168q);
        this.f15154c.setTextSize(this.f15168q);
        this.f15153b.setTextSize(this.f15168q);
        this.f15156e.setTextSize(this.f15168q);
        this.f15157f.setTextSize(this.f15168q);
        this.f15158g.setTextSize(this.f15168q);
    }

    /* renamed from: s */
    public void m14984s(boolean z9) {
        this.f15153b.setCyclic(z9);
        this.f15154c.setCyclic(z9);
        this.f15155d.setCyclic(z9);
        this.f15156e.setCyclic(z9);
        this.f15157f.setCyclic(z9);
        this.f15158g.setCyclic(z9);
    }

    /* renamed from: t */
    public final void m14985t() {
        this.f15155d.setDividerColor(this.f15171t);
        this.f15154c.setDividerColor(this.f15171t);
        this.f15153b.setDividerColor(this.f15171t);
        this.f15156e.setDividerColor(this.f15171t);
        this.f15157f.setDividerColor(this.f15171t);
        this.f15158g.setDividerColor(this.f15171t);
    }

    /* renamed from: u */
    public void m14986u(int i10) {
        this.f15171t = i10;
        m14985t();
    }

    /* renamed from: v */
    public final void m14987v() {
        this.f15155d.setDividerType(this.f15173v);
        this.f15154c.setDividerType(this.f15173v);
        this.f15153b.setDividerType(this.f15173v);
        this.f15156e.setDividerType(this.f15173v);
        this.f15157f.setDividerType(this.f15173v);
        this.f15158g.setDividerType(this.f15173v);
    }

    /* renamed from: w */
    public void m14988w(WheelView.DividerType dividerType) {
        this.f15173v = dividerType;
        m14987v();
    }

    /* renamed from: x */
    public void m14989x(int i10) {
        this.f15162k = i10;
    }

    /* renamed from: y */
    public void m14990y(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this.f15174w) {
            return;
        }
        if (str != null) {
            this.f15153b.setLabel(str);
        } else {
            this.f15153b.setLabel(this.f15152a.getContext().getString(R$string.xui_picker_view_year));
        }
        if (str2 != null) {
            this.f15154c.setLabel(str2);
        } else {
            this.f15154c.setLabel(this.f15152a.getContext().getString(R$string.xui_picker_view_month));
        }
        if (str3 != null) {
            this.f15155d.setLabel(str3);
        } else {
            this.f15155d.setLabel(this.f15152a.getContext().getString(R$string.xui_picker_view_day));
        }
        if (str4 != null) {
            this.f15156e.setLabel(str4);
        } else {
            this.f15156e.setLabel(this.f15152a.getContext().getString(R$string.xui_picker_view_hours));
        }
        if (str5 != null) {
            this.f15157f.setLabel(str5);
        } else {
            this.f15157f.setLabel(this.f15152a.getContext().getString(R$string.xui_picker_view_minutes));
        }
        if (str6 != null) {
            this.f15158g.setLabel(str6);
        } else {
            this.f15158g.setLabel(this.f15152a.getContext().getString(R$string.xui_picker_view_seconds));
        }
    }

    /* renamed from: z */
    public final void m14991z() {
        this.f15155d.setLineSpacingMultiplier(this.f15172u);
        this.f15154c.setLineSpacingMultiplier(this.f15172u);
        this.f15153b.setLineSpacingMultiplier(this.f15172u);
        this.f15156e.setLineSpacingMultiplier(this.f15172u);
        this.f15157f.setLineSpacingMultiplier(this.f15172u);
        this.f15158g.setLineSpacingMultiplier(this.f15172u);
    }
}
