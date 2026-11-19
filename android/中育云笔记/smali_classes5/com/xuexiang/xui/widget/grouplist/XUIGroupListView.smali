.class public Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public c:I

.field public d:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    sget v1, Lcom/xuexiang/xui/R$attr;->XUIGroupListViewStyle:I

    invoke-direct {p0, p1, v0, v1}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->XUIGroupListViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->XUIGroupListView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->XUIGroupListView_xui_separatorStyle:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->c:I

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->d:Landroid/util/SparseArray;

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    return-void
.end method


# virtual methods
.method public getSectionCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getSeparatorStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public setSeparatorStyle(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/grouplist/XUIGroupListView;->c:I

    .line 2
    .line 3
    return-void
.end method
