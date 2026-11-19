# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/study/ui/home/my/CourseContentFragment$initView$3$1$a;
.super Lcom/xuexiang/xui/widget/actionbar/TitleBar$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/CourseContentFragment$initView$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/study/ui/home/my/CourseContentFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/CourseContentFragment;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initView$3$1$a;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$c;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/CourseContentFragment$initView$3$1$a;->b:Lcom/zykj/study/ui/home/my/CourseContentFragment;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/CourseContentFragment;->m(Lcom/zykj/study/ui/home/my/CourseContentFragment;)Lcom/zykj/study/view/CustomX5WebView;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "javascript:window.location.reload(true)"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
