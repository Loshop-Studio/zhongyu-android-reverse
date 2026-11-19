.class public Lua/a;
.super Ln1/a;
.source "SourceFile"


# instance fields
.field public b:Ljava/util/List;

.field public c:Lcom/friday/common/entity/NoteBean;

.field public d:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/friday/common/entity/NoteBean;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua/a;->b:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lua/a;->c:Lcom/friday/common/entity/NoteBean;

    .line 7
    .line 8
    iput p3, p0, Lua/a;->d:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Ln1/a;->c(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lua/a;->b:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lcom/friday/common/entity/NoteBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lua/a;->c:Lcom/friday/common/entity/NoteBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lua/a;->d:I

    .line 2
    .line 3
    return v0
.end method
