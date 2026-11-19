.class public Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->w(IZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->f:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->c:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->d:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->e:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->f:Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->c:I

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->d:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout$c;->e:Z

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;->b(Lcom/xuexiang/xui/widget/tabbar/VerticalTabLayout;IZZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
