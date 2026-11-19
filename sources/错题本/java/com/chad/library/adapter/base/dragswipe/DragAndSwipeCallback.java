package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zykj.mistake.activity.MistakeDetailActivity;
import com.zykj.mistake.databinding.ActivityMistakeDetailBinding;
import com.zykj.mistake.entity.req.UpdatePictureNoteListReq;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.NotePresenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3198j;
import p059f5.C5527a;
import p144q4.C6422f;
import p185v7.AbstractC6683l;

/* loaded from: classes2.dex */
public class DragAndSwipeCallback extends ItemTouchHelper.Callback {

    /* renamed from: a */
    public C5527a f2652a;

    /* renamed from: b */
    public float f2653b;

    /* renamed from: c */
    public float f2654c;

    /* renamed from: d */
    public int f2655d;

    /* renamed from: e */
    public int f2656e;

    /* renamed from: a */
    public static boolean m2506a(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C6422f c6422f;
        C5527a c5527a = this.f2652a;
        super.clearView(recyclerView, viewHolder);
        if (m2506a(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            if (c5527a != null && (c6422f = c5527a.f16e) != null) {
                viewHolder.getAdapterPosition();
                c5527a.f12a.getClass();
                NoteFragment noteFragment = c6422f.f10539a;
                FragmentActivity activity = noteFragment.getActivity();
                if (activity != null && (activity instanceof MistakeDetailActivity)) {
                    ((ActivityMistakeDetailBinding) ((MistakeDetailActivity) activity).m3957p()).f6061p.setSlidingEnabled(true);
                }
                View itemView = viewHolder.itemView;
                AbstractC5830k.m5329f(itemView, "itemView");
                AbstractC6683l.m6378r(itemView);
                NotePresenter notePresenter = (NotePresenter) noteFragment.m3966h();
                long j7 = noteFragment.f7783e;
                List list = noteFragment.f7787i.f2645b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                UpdatePictureNoteListReq updatePictureNoteListReq = new UpdatePictureNoteListReq(j7, arrayList);
                C5088a c5088a = C5088a.f7986a;
                notePresenter.m3970b(C5088a.m4381b().m4396n(updatePictureNoteListReq), new C3198j(), false);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support) == null || !((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f2653b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return m2506a(viewHolder) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(this.f2655d, this.f2656e);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
        return this.f2654c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean isLongPressDragEnabled() {
        C5527a c5527a = this.f2652a;
        return c5527a != null && c5527a.f13b;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f7, int i, boolean z8) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f, f7, i, z8);
        if (i != 1 || m2506a(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        canvas.save();
        if (f > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f, view.getTop());
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder source, int i, RecyclerView.ViewHolder target, int i8, int i9, int i10) {
        super.onMoved(recyclerView, source, i, target, i8, i9, i10);
        C5527a c5527a = this.f2652a;
        if (c5527a != null) {
            BaseQuickAdapter baseQuickAdapter = c5527a.f12a;
            BaseQuickAdapter baseQuickAdapter2 = c5527a.f8562f;
            AbstractC5830k.m5330g(source, "source");
            AbstractC5830k.m5330g(target, "target");
            int adapterPosition = source.getAdapterPosition();
            baseQuickAdapter.getClass();
            int adapterPosition2 = target.getAdapterPosition();
            baseQuickAdapter.getClass();
            if (c5527a.m4892a(adapterPosition) && c5527a.m4892a(adapterPosition2)) {
                if (adapterPosition < adapterPosition2) {
                    while (adapterPosition < adapterPosition2) {
                        int i11 = adapterPosition + 1;
                        Collections.swap(baseQuickAdapter2.f2645b, adapterPosition, i11);
                        adapterPosition = i11;
                    }
                } else {
                    int i12 = adapterPosition2 + 1;
                    if (i12 <= adapterPosition) {
                        while (true) {
                            Collections.swap(baseQuickAdapter2.f2645b, adapterPosition, adapterPosition - 1);
                            if (adapterPosition == i12) {
                                break;
                            } else {
                                adapterPosition--;
                            }
                        }
                    }
                }
                baseQuickAdapter2.notifyItemMoved(source.getBindingAdapterPosition(), target.getBindingAdapterPosition());
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        C6422f c6422f;
        C5527a c5527a = this.f2652a;
        if (i == 2 && !m2506a(viewHolder)) {
            if (c5527a != null && (c6422f = c5527a.f16e) != null) {
                viewHolder.getAdapterPosition();
                c5527a.f12a.getClass();
                FragmentActivity activity = c6422f.f10539a.getActivity();
                if (activity != null && (activity instanceof MistakeDetailActivity)) {
                    ((ActivityMistakeDetailBinding) ((MistakeDetailActivity) activity).m3957p()).f6061p.setSlidingEnabled(false);
                }
                View itemView = viewHolder.itemView;
                AbstractC5830k.m5329f(itemView, "itemView");
                AbstractC6683l.m6378r(itemView);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i == 1 && !m2506a(viewHolder)) {
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        C5527a c5527a;
        if (m2506a(viewHolder) || (c5527a = this.f2652a) == null) {
            return;
        }
        BaseQuickAdapter baseQuickAdapter = c5527a.f12a;
        int adapterPosition = viewHolder.getAdapterPosition();
        baseQuickAdapter.getClass();
        if (adapterPosition < 0 || adapterPosition >= baseQuickAdapter.f2645b.size()) {
            return;
        }
        baseQuickAdapter.f2645b.remove(adapterPosition);
        baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
    }
}
