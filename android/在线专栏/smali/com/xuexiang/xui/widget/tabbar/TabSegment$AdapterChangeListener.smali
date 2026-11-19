.class Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AdapterChangeListener"
.end annotation


# instance fields
.field private mAutoRefresh:Z

.field private final mUseAdapterTitle:Z

.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->mUseAdapterTitle:Z

    return-void
.end method


# virtual methods
.method public onAdapterChanged(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/a;Landroidx/viewpager/widget/a;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-static {p2}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->access$2000(Lcom/xuexiang/xui/widget/tabbar/TabSegment;)Landroidx/viewpager/widget/ViewPager;

    move-result-object p2

    if-ne p2, p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->mUseAdapterTitle:Z

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->mAutoRefresh:Z

    invoke-virtual {p1, p3, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->setPagerAdapter(Landroidx/viewpager/widget/a;ZZ)V

    :cond_0
    return-void
.end method

.method setAutoRefresh(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$AdapterChangeListener;->mAutoRefresh:Z

    return-void
.end method
