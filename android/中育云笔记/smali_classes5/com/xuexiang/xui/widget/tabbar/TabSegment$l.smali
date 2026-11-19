.class public Lcom/xuexiang/xui/widget/tabbar/TabSegment$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/tabbar/TabSegment$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# instance fields
.field public final a:Landroidx/viewpager/widget/ViewPager;


# direct methods
.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$l;->a:Landroidx/viewpager/widget/ViewPager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$l;->a:Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    return-void
.end method
