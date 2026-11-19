.class public final Lp3/g;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final synthetic b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/g;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lp3/g;->a:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/g;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    iget-boolean v1, p0, Lp3/g;->a:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onInvalidated()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/g;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    iget-boolean v1, p0, Lp3/g;->a:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->g(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
