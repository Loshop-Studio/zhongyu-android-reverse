.class public final synthetic Lcom/zykj/student/dialogue/ui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/a;->a:Lcom/zykj/student/dialogue/ui/MainActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/a;->a:Lcom/zykj/student/dialogue/ui/MainActivity;

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;->a(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
