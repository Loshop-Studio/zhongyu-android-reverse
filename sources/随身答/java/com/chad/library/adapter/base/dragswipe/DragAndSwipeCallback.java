package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.module.BaseDraggableModule;

/* loaded from: classes3.dex */
public class DragAndSwipeCallback extends ItemTouchHelper.Callback {
    private BaseDraggableModule mDraggableModule;
    private float mMoveThreshold = 0.1f;
    private float mSwipeThreshold = 0.7f;
    private int mDragMoveFlags = 15;
    private int mSwipeMoveFlags = 32;

    public DragAndSwipeCallback(BaseDraggableModule baseDraggableModule) {
        this.mDraggableModule = baseDraggableModule;
    }

    private boolean isViewCreateByAdapter(@NonNull RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        if (isViewCreateByAdapter(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support) != null && ((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragEnd(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support) == null || !((Boolean) viewHolder.itemView.getTag(R$id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
        if (baseDraggableModule2 != null) {
            baseDraggableModule2.onItemSwipeClear(viewHolder);
        }
        viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.mMoveThreshold;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        return isViewCreateByAdapter(viewHolder) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
        return this.mSwipeThreshold;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            return baseDraggableModule.getIsSwipeEnabled();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        return (baseDraggableModule == null || !baseDraggableModule.getIsDragEnabled() || this.mDraggableModule.hasToggleView()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f10, float f11, int i9, boolean z9) {
        super.onChildDrawOver(canvas, recyclerView, viewHolder, f10, f11, i9, z9);
        if (i9 != 1 || isViewCreateByAdapter(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        canvas.save();
        if (f10 > 0.0f) {
            canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f10, view.getBottom());
            canvas.translate(view.getLeft(), view.getTop());
        } else {
            canvas.clipRect(view.getRight() + f10, view.getTop(), view.getRight(), view.getBottom());
            canvas.translate(view.getRight() + f10, view.getTop());
        }
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemSwiping(canvas, viewHolder, f10, f11, z9);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
        return viewHolder.getItemViewType() == viewHolder2.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i9, @NonNull RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12) {
        super.onMoved(recyclerView, viewHolder, i9, viewHolder2, i10, i11, i12);
        BaseDraggableModule baseDraggableModule = this.mDraggableModule;
        if (baseDraggableModule != null) {
            baseDraggableModule.onItemDragMoving(viewHolder, viewHolder2);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i9) {
        if (i9 == 2 && !isViewCreateByAdapter(viewHolder)) {
            BaseDraggableModule baseDraggableModule = this.mDraggableModule;
            if (baseDraggableModule != null) {
                baseDraggableModule.onItemDragStart(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
        } else if (i9 == 1 && !isViewCreateByAdapter(viewHolder)) {
            BaseDraggableModule baseDraggableModule2 = this.mDraggableModule;
            if (baseDraggableModule2 != null) {
                baseDraggableModule2.onItemSwipeStart(viewHolder);
            }
            viewHolder.itemView.setTag(R$id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
        }
        super.onSelectedChanged(viewHolder, i9);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i9) {
        BaseDraggableModule baseDraggableModule;
        if (isViewCreateByAdapter(viewHolder) || (baseDraggableModule = this.mDraggableModule) == null) {
            return;
        }
        baseDraggableModule.onItemSwiped(viewHolder);
    }

    public void setDragMoveFlags(int i9) {
        this.mDragMoveFlags = i9;
    }

    public void setMoveThreshold(float f10) {
        this.mMoveThreshold = f10;
    }

    public void setSwipeMoveFlags(int i9) {
        this.mSwipeMoveFlags = i9;
    }

    public void setSwipeThreshold(float f10) {
        this.mSwipeThreshold = f10;
    }
}
