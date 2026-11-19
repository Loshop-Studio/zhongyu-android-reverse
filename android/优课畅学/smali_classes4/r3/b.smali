.class public final synthetic Lr3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/b;->a:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr3/b;->a:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->h(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
