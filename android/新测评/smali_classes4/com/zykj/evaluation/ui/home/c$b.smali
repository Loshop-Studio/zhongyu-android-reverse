.class public Lcom/zykj/evaluation/ui/home/c$b;
.super Lcom/zykj/evaluation/ui/home/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/home/c$b$a;
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Long;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "gradeName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p2, v0}, Lcom/zykj/evaluation/ui/home/c;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/c$b;->b:Ljava/lang/Long;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/c$b;->c:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Long;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/c$b;->b:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
.end method
