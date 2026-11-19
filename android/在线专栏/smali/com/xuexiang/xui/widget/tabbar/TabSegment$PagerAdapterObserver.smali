.class Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/TabSegment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PagerAdapterObserver"
.end annotation


# instance fields
.field private final mUseAdapterTitle:Z

.field final synthetic this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/tabbar/TabSegment;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;->mUseAdapterTitle:Z

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;->mUseAdapterTitle:Z

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->populateFromPagerAdapter(Z)V

    return-void
.end method

.method public onInvalidated()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;->this$0:Lcom/xuexiang/xui/widget/tabbar/TabSegment;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabSegment$PagerAdapterObserver;->mUseAdapterTitle:Z

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/tabbar/TabSegment;->populateFromPagerAdapter(Z)V

    return-void
.end method
