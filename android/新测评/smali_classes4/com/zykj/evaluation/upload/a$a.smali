.class public final Lcom/zykj/evaluation/upload/a$a;
.super Lcom/zykj/evaluation/upload/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/upload/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final c:Lcom/zykj/evaluation/upload/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/upload/a$a;

    invoke-direct {v0}, Lcom/zykj/evaluation/upload/a$a;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/upload/a$a;->c:Lcom/zykj/evaluation/upload/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "log"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {p0, v2, v0, v1}, Lcom/zykj/evaluation/upload/a;-><init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
