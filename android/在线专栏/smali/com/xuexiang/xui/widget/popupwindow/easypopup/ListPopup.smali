.class public Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;
.super Lcom/xuexiang/xui/widget/popupwindow/easypopup/BaseCustomPopup;
.source "SourceFile"


# instance fields
.field private mAdapter:Landroid/widget/BaseAdapter;

.field private mMaxHeight:I

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/BaseCustomPopup;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public getAdapter()Landroid/widget/BaseAdapter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mAdapter:Landroid/widget/BaseAdapter;

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mMaxHeight:I

    return v0
.end method

.method protected initAttributes()V
    .locals 4

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/XUIWrapContentListView;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mMaxHeight:I

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/XUIWrapContentListView;-><init>(Landroid/content/Context;I)V

    .line 2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->mWidth:I

    iget v3, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mMaxHeight:I

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVerticalScrollBarEnabled(Z)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 7
    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_config_list_item_selector:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 9
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;->setContentView(Landroid/view/View;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/EasyPopup;

    return-void
.end method

.method protected initViews(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public setAdapter(Landroid/widget/BaseAdapter;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mAdapter:Landroid/widget/BaseAdapter;

    return-object p0
.end method

.method public setMaxHeight(I)Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mMaxHeight:I

    return-object p0
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/popupwindow/easypopup/ListPopup;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    return-object p0
.end method
