.class public final Lp3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/e;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAdapterChanged(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/PagerAdapter;Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lp3/e;->b:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    iget-object v0, p2, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->u:Landroidx/viewpager/widget/ViewPager;

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iget-boolean v0, p0, Lp3/e;->a:Z

    .line 9
    .line 10
    invoke-virtual {p2, p3, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->j(Landroidx/viewpager/widget/PagerAdapter;ZZ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
