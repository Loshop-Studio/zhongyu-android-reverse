.class public final synthetic Lw3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/repository/NotificationRepository;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/c;->a:Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw3/c;->a:Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    invoke-static {v0}, Lcom/zykj/huiwei/launcher/repository/NotificationRepository;->a(Lcom/zykj/huiwei/launcher/repository/NotificationRepository;)Landroidx/paging/PagingSource;

    move-result-object v0

    return-object v0
.end method
