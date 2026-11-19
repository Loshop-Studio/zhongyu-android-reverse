.class public final synthetic Lr3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/a;->a:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr3/a;->a:Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;

    invoke-static {v0, p1}, Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;->g(Lcom/zykj/lib/login/ui/teacher/sms/SendSmsDialog;Landroid/view/View;)V

    return-void
.end method
