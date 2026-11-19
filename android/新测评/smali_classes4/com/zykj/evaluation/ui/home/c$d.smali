.class public Lcom/zykj/evaluation/ui/home/c$d;
.super Lcom/zykj/evaluation/ui/home/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/home/c$d$a;
    }
.end annotation


# instance fields
.field public final b:J

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "topicName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p3, v0}, Lcom/zykj/evaluation/ui/home/c;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, Lcom/zykj/evaluation/ui/home/c$d;->b:J

    .line 11
    .line 12
    iput-object p3, p0, Lcom/zykj/evaluation/ui/home/c$d;->c:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/home/c$d;->b:J

    .line 2
    .line 3
    return-wide v0
.end method
