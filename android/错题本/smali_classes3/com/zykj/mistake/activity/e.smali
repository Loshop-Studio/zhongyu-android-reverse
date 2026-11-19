.class public final synthetic Lcom/zykj/mistake/activity/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/String;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/String;

    .line 6
    .line 7
    sget v0, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 8
    .line 9
    const-string v0, "target"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "startTime"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "endTime"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/mistake/activity/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MainActivity;->o()Lcom/zykj/mistake/main/MainShellViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/zykj/mistake/main/d0;

    .line 31
    .line 32
    invoke-direct {v1, p1, p2, p3}, Lcom/zykj/mistake/main/d0;-><init>(Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 39
    .line 40
    return-object p1
.end method
