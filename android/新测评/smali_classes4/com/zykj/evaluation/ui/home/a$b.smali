.class public final Lcom/zykj/evaluation/ui/home/a$b;
.super Lcom/zykj/evaluation/ui/home/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lcom/zykj/evaluation/ui/home/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/home/a$b;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/home/a$b;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/home/a$b;->c:Lcom/zykj/evaluation/ui/home/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/evaluation/bean/TaskListType$CompletedTask;->INSTANCE:Lcom/zykj/evaluation/bean/TaskListType$CompletedTask;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u5df2\u5b8c\u6210\u6d4b\u8bc4"

    .line 5
    .line 6
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/evaluation/ui/home/a;-><init>(Ljava/lang/String;Lcom/zykj/evaluation/bean/TaskListType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/home/a$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x2376b831

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CompletedTask"

    return-object v0
.end method
