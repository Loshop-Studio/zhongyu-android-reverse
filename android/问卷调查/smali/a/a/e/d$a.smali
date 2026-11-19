.class public La/a/e/d$a;
.super La/a/e/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/e/d;->b(Ljava/lang/String;La/a/e/f/a;La/a/e/b;)La/a/e/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/e/c<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/a/e/d;


# direct methods
.method public constructor <init>(La/a/e/d;Ljava/lang/String;ILa/a/e/f/a;)V
    .locals 0

    iput-object p1, p0, La/a/e/d$a;->b:La/a/e/d;

    iput-object p2, p0, La/a/e/d$a;->a:Ljava/lang/String;

    invoke-direct {p0}, La/a/e/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, La/a/e/d$a;->b:La/a/e/d;

    iget-object v1, p0, La/a/e/d$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, La/a/e/d;->c(Ljava/lang/String;)V

    return-void
.end method
