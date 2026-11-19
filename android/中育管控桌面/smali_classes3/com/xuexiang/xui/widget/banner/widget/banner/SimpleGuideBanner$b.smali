.class public Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->r(I)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->M(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$b;->a:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->M(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
