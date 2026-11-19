.class final Lcom/zykj/message/UnLoginActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/UnLoginActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/zykj/message/UnLoginActivity$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/message/UnLoginActivity$a;

    invoke-direct {v0}, Lcom/zykj/message/UnLoginActivity$a;-><init>()V

    sput-object v0, Lcom/zykj/message/UnLoginActivity$a;->a:Lcom/zykj/message/UnLoginActivity$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    invoke-static {}, Lz1/a;->i()Lz1/a;

    move-result-object p1

    invoke-virtual {p1}, Lz1/a;->c()V

    return-void
.end method
