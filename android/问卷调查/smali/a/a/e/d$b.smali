.class public La/a/e/d$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:La/a/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/e/b<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final b:La/a/e/f/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/e/f/a<",
            "*TO;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/a/e/b;La/a/e/f/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/e/b<",
            "TO;>;",
            "La/a/e/f/a<",
            "*TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a/e/d$b;->a:La/a/e/b;

    iput-object p2, p0, La/a/e/d$b;->b:La/a/e/f/a;

    return-void
.end method
