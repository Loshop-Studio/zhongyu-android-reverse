.class public final synthetic Lo6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcom/liulishuo/okdownload/a;


# direct methods
.method public synthetic constructor <init>(Lcom/liulishuo/okdownload/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/n;->a:Lcom/liulishuo/okdownload/a;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/n;->a:Lcom/liulishuo/okdownload/a;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;->m(Lcom/liulishuo/okdownload/a;Landroid/content/DialogInterface;)V

    return-void
.end method
