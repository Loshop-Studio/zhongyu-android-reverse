.class public final synthetic Lb4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/k;->a:Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/k;->a:Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;->n(Lcom/zykj/huiwei/launcher/ui/dialog/CrashHintDialog;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
