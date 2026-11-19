.class public Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Lcom/zykj/lib/ota/viewmodel/VersionViewModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lh7/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;->a:Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/lib/ota/viewmodel/VersionViewModel;->l()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public b(Lcom/zykj/lib/ota/viewmodel/VersionViewModel;)Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;->a:Lcom/zykj/lib/ota/viewmodel/VersionViewModel;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/lib/ota/databinding/DialogCheckUpdateBindingImpl$d;->a()Lh7/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
