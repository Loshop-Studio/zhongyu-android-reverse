.class public final Lcom/zykj/study/viewmodels/b$b;
.super Lcom/zykj/study/viewmodels/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/viewmodels/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lcom/zykj/study/viewmodels/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/viewmodels/b$b;

    invoke-direct {v0}, Lcom/zykj/study/viewmodels/b$b;-><init>()V

    sput-object v0, Lcom/zykj/study/viewmodels/b$b;->a:Lcom/zykj/study/viewmodels/b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/zykj/study/viewmodels/b;-><init>(Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
