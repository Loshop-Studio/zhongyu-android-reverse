.class public interface abstract Lje/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje/k$a;
    }
.end annotation


# static fields
.field public static final a:Lje/k$a;

.field public static final b:Lje/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lje/k$a;->a:Lje/k$a;

    .line 2
    .line 3
    sput-object v0, Lje/k;->a:Lje/k$a;

    .line 4
    .line 5
    new-instance v0, Lje/k$a$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lje/k$a$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lje/k;->b:Lje/k;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Lje/r;Ljava/util/List;)V
.end method

.method public abstract b(Lje/r;)Ljava/util/List;
.end method
