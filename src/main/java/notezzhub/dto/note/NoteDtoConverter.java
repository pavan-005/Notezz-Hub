package notezzhub.dto.note;

import notezzhub.data.note.Note;
import notezzhub.dto.DtoConverter;

public interface NoteDtoConverter extends DtoConverter<NoteDto, Note> {
    NoteDto convertToDtoIgnoreNull(Note entity);

    Note convertToEntityIgnoreNull(NoteDto dto);
}
