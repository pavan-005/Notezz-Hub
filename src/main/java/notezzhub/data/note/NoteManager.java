package notezzhub.data.note;

import notezzhub.data.user.User;
import notezzhub.dto.note.NoteDto;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface NoteManager {
    void saveNew(NoteDto noteDto, User user);

    List<NoteDto> getAllUnarchived(User user);

    List<NoteDto> getAllUnarchivedByCreated(User user, LocalDate created);

    List<NoteDto> getAllDoneUnarchived(User user);

    List<NoteDto> getAllNotDoneUnarchived(User user);

    List<NoteDto> getAllArchived(User user);

    void update(NoteDto noteDto, User user);

    Optional<NoteDto> getById(Long id);

    void deleteById(Long id);

    void archive(Long id);

    void unarchive(Long id);
}
