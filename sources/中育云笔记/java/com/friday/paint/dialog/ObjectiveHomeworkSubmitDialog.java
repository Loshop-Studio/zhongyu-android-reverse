package com.friday.paint.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.base.BaseDialogFragment;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.entity.OptionEntity;
import com.friday.common.entity.OptionListEntity;
import com.friday.common.helper.C5962b;
import com.friday.paint.R$dimen;
import com.friday.paint.R$layout;
import com.friday.paint.R$style;
import com.friday.paint.adapter.OptionsListAdapter;
import com.friday.paint.databinding.WindowObjectiveHomeworkBinding;
import com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog;
import com.friday.paint.viewmodel.DoHomeworkViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ObjectiveHomeworkSubmitDialog extends BaseDialogFragment<WindowObjectiveHomeworkBinding> {

    /* renamed from: f */
    public final InterfaceC10773d f9873f;

    /* renamed from: g */
    public OptionsListAdapter f9874g;

    /* renamed from: h */
    public InterfaceC10045g f9875h;

    /* renamed from: com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$a */
    public static final class C6240a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f9880c;

        public C6240a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f9880c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f9880c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f9880c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1", m26211f = "ObjectiveHomeworkSubmitDialog.kt", m26212l = {Opcodes.IFNONNULL}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$startBtEnableStatusJob$1 */
    public static final class C62411 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9881c;

        public C62411(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return ObjectiveHomeworkSubmitDialog.this.new C62411(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9881c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ObjectiveHomeworkSubmitDialog.m7324w(ObjectiveHomeworkSubmitDialog.this).f9866d.f9829f.setEnabled(false);
                this.f9881c = 1;
                if (DelayKt.m20376b(CoroutineLiveDataKt.DEFAULT_TIMEOUT, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            ObjectiveHomeworkSubmitDialog.m7324w(ObjectiveHomeworkSubmitDialog.this).f9866d.f9829f.setEnabled(true);
            ToastUtils.showShort("随堂测数据连接异常，暂时无法提交", new Object[0]);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62411) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public ObjectiveHomeworkSubmitDialog() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9873f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(DoHomeworkViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    public static final void m7314A(ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog, View view) {
        objectiveHomeworkSubmitDialog.dismissAllowingStateLoss();
    }

    /* renamed from: B */
    public static final C10786q m7315B(ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog, boolean z10, Boolean bool) {
        if (bool.booleanValue()) {
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9829f.setVisibility(8);
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9827d.setText("我的答案");
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setText("已截止");
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setVisibility(0);
        } else if (z10) {
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9829f.setVisibility(8);
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9827d.setText("我的答案");
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setText("已提交");
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setVisibility(0);
        } else {
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setVisibility(8);
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9829f.setVisibility(0);
            if (objectiveHomeworkSubmitDialog.m7329x().m7635r()) {
                ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9827d.setText("单选题");
            } else {
                ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9827d.setText("多选题");
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: C */
    public static final void m7316C(ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog, String str) {
        InterfaceC10045g interfaceC10045g = objectiveHomeworkSubmitDialog.f9875h;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        if (AbstractC9979u.m20289b(str, "NORMAL")) {
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9867e.getRoot().setVisibility(8);
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.getRoot().setVisibility(0);
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9829f.setVisibility(8);
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setText("已提交");
            OptionsListAdapter optionsListAdapter = objectiveHomeworkSubmitDialog.f9874g;
            if (optionsListAdapter != null) {
                optionsListAdapter.m7305l(true);
            }
            ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.f9828e.setVisibility(0);
        }
    }

    /* renamed from: D */
    public static final void m7317D(ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog, View view) {
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9867e.getRoot().setVisibility(8);
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.getRoot().setVisibility(0);
    }

    private final void startBtEnableStatusJob() {
        InterfaceC10045g interfaceC10045g = this.f9875h;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f9875h = AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62411(null), 3, null);
    }

    /* renamed from: w */
    public static final /* synthetic */ WindowObjectiveHomeworkBinding m7324w(ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog) {
        return (WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding();
    }

    /* renamed from: y */
    public static final void m7325y(final ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog, View view) {
        final List<OptionListEntity> data;
        Object next;
        if (!NetworkUtils.isWifiConnected()) {
            AbstractC11958b.m26588i("网络异常，提交失败，请重试。");
            return;
        }
        OptionsListAdapter optionsListAdapter = objectiveHomeworkSubmitDialog.f9874g;
        if (optionsListAdapter == null || (data = optionsListAdapter.getData()) == null) {
            return;
        }
        int size = data.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            Iterator<T> it = data.get(i10).getList().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((OptionEntity) next).isSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (((OptionEntity) next) == null) {
                z10 = false;
            }
        }
        if (!z10) {
            AbstractC11958b.m26588i("全部作答后提交");
            return;
        }
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9867e.getRoot().setVisibility(0);
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.getRoot().setVisibility(8);
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9867e.f9821d.setOnClickListener(new View.OnClickListener() { // from class: a4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ObjectiveHomeworkSubmitDialog.m7326z(data, objectiveHomeworkSubmitDialog, view2);
            }
        });
    }

    /* renamed from: z */
    public static final void m7326z(List list, ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog, View view) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            List<OptionEntity> list2 = ((OptionListEntity) obj).getList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((OptionEntity) obj2).isSelected()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(arrayList2, 10));
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                arrayList3.add(((OptionEntity) obj3).getOption());
            }
            arrayList.add(arrayList3);
            i10 = i11;
        }
        objectiveHomeworkSubmitDialog.m7328F(arrayList);
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9867e.getRoot().setVisibility(8);
        ((WindowObjectiveHomeworkBinding) objectiveHomeworkSubmitDialog.getMBinding()).f9866d.getRoot().setVisibility(0);
        objectiveHomeworkSubmitDialog.startBtEnableStatusJob();
    }

    /* renamed from: E */
    public final String m7327E(int i10) {
        switch (i10) {
            case 1:
                return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return ExifInterface.LONGITUDE_EAST;
            case 6:
                return "F";
            case 7:
                return "G";
            case 8:
                return "H";
            default:
                return "";
        }
    }

    /* renamed from: F */
    public final void m7328F(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                stringBuffer.append((String) it2.next());
            }
            arrayList.add(stringBuffer.toString());
        }
        Observable observable = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType = MqttType.REQUEST_SUBMIT_HOMEWORK;
        MqttResponse mqttResponseM7629l = m7329x().m7629l();
        String strValueOf = String.valueOf(mqttResponseM7629l != null ? mqttResponseM7629l.getGuid() : null);
        int i10 = m7329x().m7635r() ? 1 : 2;
        int iM7632o = m7329x().m7632o();
        C5962b.a aVar = C5962b.f6082a;
        String json = GsonUtils.toJson(new MqttResponse(strValueOf, 1, new MqttResponse.Data("", i10, iM7632o, new MqttResponse.Student(aVar.m5299a().m5293u(), String.valueOf(aVar.m5299a().m5292t())), arrayList, true, null)));
        AbstractC9979u.m20293f(json, "toJson(...)");
        observable.post(new MqttEntity(mqttType, json, null, 4, null));
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.window_objective_homework;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        if (m7329x().m7626i()) {
            m7329x().m7638u(false);
            m7329x().m7623f().clear();
            int iM7633p = m7329x().m7633p();
            if (1 <= iM7633p) {
                int i10 = 1;
                while (true) {
                    ArrayList arrayList = new ArrayList();
                    int iM7632o = m7329x().m7632o();
                    if (1 <= iM7632o) {
                        int i11 = 1;
                        while (true) {
                            arrayList.add(new OptionEntity(m7329x().m7635r(), m7327E(i11), false, 4, null));
                            if (i11 == iM7632o) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    m7329x().m7623f().add(new OptionListEntity(i10, arrayList));
                    if (i10 == iM7633p) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        ((WindowObjectiveHomeworkBinding) getMBinding()).f9865c.setOnClickListener(new View.OnClickListener() { // from class: a4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ObjectiveHomeworkSubmitDialog.m7314A(this.f43c, view);
            }
        });
        Boolean bool = (Boolean) m7329x().m7627j().getValue();
        final boolean zM7628k = m7329x().m7628k();
        m7329x().m7627j().observe(this, new C6240a(new InterfaceC9540l() { // from class: a4.d
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return ObjectiveHomeworkSubmitDialog.m7315B(this.f44c, zM7628k, (Boolean) obj);
            }
        }));
        LiveEventBus.get("submitHomeworkReply", String.class).observe(this, new Observer() { // from class: a4.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ObjectiveHomeworkSubmitDialog.m7316C(this.f46c, (String) obj);
            }
        });
        RecyclerView recyclerView = ((WindowObjectiveHomeworkBinding) getMBinding()).f9866d.f9826c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        OptionsListAdapter optionsListAdapter = new OptionsListAdapter(R$layout.item_student_objective, m7329x().m7632o(), m7329x().m7635r());
        this.f9874g = optionsListAdapter;
        recyclerView.setAdapter(optionsListAdapter);
        OptionsListAdapter optionsListAdapter2 = this.f9874g;
        if (optionsListAdapter2 != null) {
            optionsListAdapter2.m7305l((bool == null || !bool.booleanValue()) ? m7329x().m7628k() : true);
        }
        OptionsListAdapter optionsListAdapter3 = this.f9874g;
        if (optionsListAdapter3 != null) {
            optionsListAdapter3.setList(m7329x().m7623f());
        }
        ((WindowObjectiveHomeworkBinding) getMBinding()).f9867e.f9820c.setOnClickListener(new View.OnClickListener() { // from class: a4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ObjectiveHomeworkSubmitDialog.m7317D(this.f47c, view);
            }
        });
        ((WindowObjectiveHomeworkBinding) getMBinding()).f9866d.f9829f.setOnClickListener(new View.OnClickListener() { // from class: a4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ObjectiveHomeworkSubmitDialog.m7325y(this.f48c, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_189), (int) getResources().getDimension(R$dimen.view_243));
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.x = (int) getResources().getDimension(R$dimen.view_376);
            }
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (attributes2 != null) {
                attributes2.y = (int) getResources().getDimension(R$dimen.view_71);
            }
            window.setGravity(8388691);
            WindowManager.LayoutParams attributes3 = window.getAttributes();
            if (attributes3 != null) {
                attributes3.dimAmount = 0.0f;
            }
            window.setFlags(8, 8);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
        super.onStart();
    }

    /* renamed from: x */
    public final DoHomeworkViewModel m7329x() {
        return (DoHomeworkViewModel) this.f9873f.getValue();
    }
}
