.class public interface abstract Lq/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq/h;

.field public static final b:Lq/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lq/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq/h;->a:Lq/h;

    .line 7
    .line 8
    new-instance v0, Lq/j$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lq/j$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lq/j$a;->a()Lq/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lq/h;->b:Lq/h;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
