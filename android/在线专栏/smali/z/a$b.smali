.class Lz/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/f$c;

.field final synthetic b:I

.field final synthetic c:Lz/a;


# direct methods
.method constructor <init>(Lz/a;Lz/f$c;I)V
    .locals 0

    iput-object p1, p0, Lz/a$b;->c:Lz/a;

    iput-object p2, p0, Lz/a$b;->a:Lz/f$c;

    iput p3, p0, Lz/a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lz/a$b;->a:Lz/f$c;

    iget v1, p0, Lz/a$b;->b:I

    invoke-virtual {v0, v1}, Lz/f$c;->a(I)V

    return-void
.end method
