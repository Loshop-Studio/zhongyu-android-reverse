.class public final Lcom/zykj/message/UnLoginActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/UnLoginActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final b:Lcom/zykj/message/UnLoginActivity$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/message/UnLoginActivity$a;

    invoke-direct {v0}, Lcom/zykj/message/UnLoginActivity$a;-><init>()V

    sput-object v0, Lcom/zykj/message/UnLoginActivity$a;->b:Lcom/zykj/message/UnLoginActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    sget-object p1, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 2
    invoke-virtual {p1}, Lb/d/a/b/a;->a()V

    return-void
.end method
