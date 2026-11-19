.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public c:Z

.field public final d:Z

.field public final synthetic e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->d:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->c:Z

    .line 2
    .line 3
    return-void
.end method

.method public onAdapterChanged(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/PagerAdapter;Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->o(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroidx/viewpager/widget/ViewPager;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-ne p2, p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->e:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    .line 10
    .line 11
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->d:Z

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$d;->c:Z

    .line 14
    .line 15
    invoke-virtual {p1, p3, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->c0(Landroidx/viewpager/widget/PagerAdapter;ZZ)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
