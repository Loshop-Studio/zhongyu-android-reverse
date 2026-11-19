.class public Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;
.super Landroidx/recyclerview/widget/RecyclerView$OnFlingListener;
.source "SourceFile"


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnFlingListener;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;->a:Z

    .line 6
    .line 7
    new-instance v0, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/banner/recycler/layout/b;-><init>(Lcom/xuexiang/xui/widget/banner/recycler/layout/CenterSnapHelper;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onFling(II)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method
