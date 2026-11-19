.class public Lcom/friday/login/view/Hilt_LoginActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/contextaware/OnContextAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/login/view/Hilt_LoginActivity;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/login/view/Hilt_LoginActivity;


# direct methods
.method public constructor <init>(Lcom/friday/login/view/Hilt_LoginActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/login/view/Hilt_LoginActivity$a;->a:Lcom/friday/login/view/Hilt_LoginActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onContextAvailable(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/friday/login/view/Hilt_LoginActivity$a;->a:Lcom/friday/login/view/Hilt_LoginActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/login/view/Hilt_LoginActivity;->inject()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
