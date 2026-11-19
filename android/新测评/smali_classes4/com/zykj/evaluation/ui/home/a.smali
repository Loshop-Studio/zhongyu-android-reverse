.class public abstract Lcom/zykj/evaluation/ui/home/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/home/a$a;,
        Lcom/zykj/evaluation/ui/home/a$b;,
        Lcom/zykj/evaluation/ui/home/a$c;,
        Lcom/zykj/evaluation/ui/home/a$d;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/zykj/evaluation/bean/TaskListType;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/zykj/evaluation/bean/TaskListType;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/a;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/a;->b:Lcom/zykj/evaluation/bean/TaskListType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/evaluation/bean/TaskListType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/a;-><init>(Ljava/lang/String;Lcom/zykj/evaluation/bean/TaskListType;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lcom/zykj/evaluation/bean/TaskListType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/a;->b:Lcom/zykj/evaluation/bean/TaskListType;

    .line 2
    .line 3
    return-object v0
.end method
